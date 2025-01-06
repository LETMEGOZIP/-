package org.koreait.file.services;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.koreait.file.entities.FileInfo;
import org.koreait.file.exceptions.FileNotFoundException;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

@Lazy
@Service
@RequiredArgsConstructor
public class FileDownloadService {
    private final FileInfoService infoService;
    private final HttpServletResponse response;

    public void process(Long seq) {

        FileInfo item = infoService.get(seq); //

        String fileName = item.getFileName();
        // 윈도우에서 한글 깨짐 방지
        fileName = new String(fileName.getBytes(), StandardCharsets.ISO_8859_1);

        String contentType = item.getContentType();
        contentType = StringUtils.hasText(contentType) ? contentType : "application/octet-stream"; // 파일 유형 기본값 지정

        File file = new File(item.getFilePath()); // 경로 따와서 파일 객체 생성
        if (!file.exists()) { // 사실 없으면
            throw new FileNotFoundException(); // 에러
        }

        try (FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis)) { // 버퍼에 담고
            // 바디의 출력을 filename에 지정된 파일로 변경
            response.setHeader("Content-Disposition", "attachment; filename=" + fileName); // 출력의 흐름이 파일?쪽?으로? 절라? 중요?한?헤더
            response.setContentType(contentType); // 다운 후 활동 지정 같은데에서 필요할 수도 있ㅇㅁ
            response.setHeader("Cache-Control", "no-cache"); // 노캐시 하지 않으면 브라우저 캐싱 때문에 꼬일 수 있음
            response.setHeader("Pragma", "no-cache"); // 프라그마 - 옛날 브라우저 캐시 컨트롤
            response.setIntHeader("Expires", 0); // 만료시간을 없앤다.
            response.setContentLengthLong(file.length());

            OutputStream out = response.getOutputStream();
            out.write(bis.readAllBytes()); // 바디에 출력

        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
