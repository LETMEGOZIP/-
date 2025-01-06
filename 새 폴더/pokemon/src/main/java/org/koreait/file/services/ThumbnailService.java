package org.koreait.file.services;

import lombok.RequiredArgsConstructor;
import net.coobird.thumbnailator.Thumbnails;
import org.koreait.file.controllers.RequestThumb;
import org.koreait.file.entities.FileInfo;
import org.koreait.global.configs.FileProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

@Lazy
@Service
@RequiredArgsConstructor
@EnableConfigurationProperties(FileProperties.class)
public class ThumbnailService {
    private final FileProperties properties;
    private final FileInfoService infoService;
    private final RestTemplate restTemplate;

    /**
     * Thumbnail 경로
     * thumbs/폴더번호/seq_너비_높이.확장자
     * thumbs/폴더번호/urls/정수해시코드_너비_높이.확장자
     */

    public String getThumbPath(Long seq, String url, int width, int height){
        String thumbPath = properties.getPath();
        if(seq != null && seq > 0L) { // 직접 서버에 올린 파일
            FileInfo item = infoService.get(seq);

            thumbPath = thumbPath + String.format("%d/%d_%d_%d_%d;", seq%10L, seq, width, height, item.getExtension());
        } else if(StringUtils.hasText(url)){ // 원격 url 이미지인경우
            String extension = url.lastIndexOf(".") == -1 ? "": url.substring(url.lastIndexOf("."));
            thumbPath = thumbPath + String.format("urls/%d_%d_%d%s", Objects.hash(url), width, height,  extension );
        }
        File file = new File(thumbPath);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

        return thumbPath;
    }

    public String create(RequestThumb form){
        Long seq = form.getSeq();
        String url = form.getUrl();
        int width = Math.max(form.getWidth(), 50);
        int height = Math.max(form.getHeight(), 50);

        String thumbPath = getThumbPath(seq, url, width, height);
        File file = new File(thumbPath);
        if(file.exists()){
            return thumbPath;
        }

        try{
        if(seq != null && seq > 0L) {
            FileInfo item = infoService.get(seq);
            Thumbnails.of(item.getFilePath())
                    .size(width, height)
                    .toFile(file);
        }else if(StringUtils.hasText(url)){
            String original = String.format("%s_original", thumbPath);
            byte[] bytes = restTemplate.getForObject(URI.create(url), byte[].class);
            Files.write(Paths.get(original), bytes);
            Thumbnails.of(original)
                    .size(width, height)
                    .toFile(file);
            }else {
                thumbPath = null;
            }
        } catch (Exception e){}
        return thumbPath;

    }
}