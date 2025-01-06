package org.koreait.file.services;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.koreait.file.entities.FileInfo;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.koreait.file.exceptions.FileNotFoundException;


import java.io.*;
import java.nio.charset.StandardCharsets;

@Lazy
@Service
@RequiredArgsConstructor
public class FileDownloadService {
    private final HttpServletResponse response;
    private final FileInfoService infoService;

    public void process(Long seq) {

        FileInfo item = infoService.get(seq);

        String filePath = item.getFilePath();
        String fileName = item.getFileName();
        // 윈도우에서 한글 깨짐 방지
        fileName = new String(fileName.getBytes(), StandardCharsets.ISO_8859_1);

        String contentType = item.getContentType();
        contentType = StringUtils.hasText(contentType) ? contentType : "application/octet-stream";

        File file = new File(item.getFilePath());
        if(!file.exists()){
            throw new FileNotFoundException();
        }

        try(FileInputStream fis = new FileInputStream(file); BufferedInputStream bis = new BufferedInputStream(fis)){
        // 바디의 출력을 filename에 지정된 파일로 변경
            response.setHeader("Content-Disposition"/*중요하대*/, "attachment; filename=test.txt");
            response.setContentType(contentType);
            response.setHeader("Cache-Control", "no-cache");
            response.setHeader("Pragma", "no-cache");
            response.setIntHeader("Expires", 0); // 만료 시간 없앰
            OutputStream out = response.getOutputStream();
            out.write(bis.readAllBytes());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
