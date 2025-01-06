package org.koreait.global.libs;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.koreait.file.entities.FileInfo;
import org.koreait.file.services.FileInfoService;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.util.*;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class Utils {

    private final HttpServletRequest request;
    private final MessageSource messageSource; // 싱글턴
    private final FileInfoService fileInfoService;

    public boolean isMobile() {

        // 요청 헤더 - User-Agent / 브라우저 정보
        String ua = request.getHeader("User-Agent");
        String pattern = ".*(iPhone|iPod|iPad|BlackBerry|Android|Windows CE|LG|MOT|SAMSUNG|SonyEricsson).*";


        return ua.matches(pattern);
    }

    /**
     * mobile, front 템플릿 분리 함수
     *
     * @param path
     * @return
     */
    public String tpl(String path) {
        String prefix = isMobile() ? "mobile" : "front";

        return String.format("%s/%s", prefix, path);
    }

    /**
     * 메서지 코드로 조회된 문구
     *
     * @param code
     * @return
     */
    public String getMessage(String code) {
        Locale lo = request.getLocale(); // 사용자 요청 헤더(Accept-Language)

        return messageSource.getMessage(code, null, lo);
    }


    public List<String> getMessages(String[] codes) {
        return Arrays.stream(codes).map(c->{
            try {
                return getMessage(c);
            }catch (Exception e){
                return "";
            }
        }).filter(s-> !s.isBlank()).toList();
    }


    /**
     * REST 커맨드 객체 검증 실패 시에 에러 코드를 가지고 메세지 추출
     * @param errors
     * @return
     */

    public Map<String, List<String>> getErrorMessages(Errors errors){ // 레스트 컨트롤러에 쓰?려고? 템플릿이 없으니까? JSON 형태로 가?공하려고? 만?든 메서?드
        ResourceBundleMessageSource ms = (ResourceBundleMessageSource) messageSource;
        ms.setUseCodeAsDefaultMessage(false);

        try {
            // 필드 별 에러 코드
            // Collections.toMap
            Map<String, List<String>> messages = errors.getFieldErrors()
                    .stream()
                    .collect(Collectors.toMap(FieldError::getField, f-> getMessages(f.getCodes()), (v1, v2) -> v2)); // 스트링을 맵 형태로

            // 글로벌 에러코드 - getGlobalErrors()
            List<String> gMessages = errors.getGlobalErrors()
                    .stream()
                    .flatMap(o-> getMessages(o.getCodes()).stream())
                    .toList();

            // 글로벌 에러코드 필드 - global
            if (!gMessages.isEmpty()) {
                messages.put("global", gMessages);
            }

            return messages;

        }finally {
            ms.setUseCodeAsDefaultMessage(true);
        }
    }

    /**
     *
     * @param width
     * @param height
     * @param mode - image - 이미지 태그로 출력, background 배겨 이미지 형태 풀력
     * @return
     */

    public String showImage(Long seq, int width, int height, String mode, String className){
        return showImage(seq, null, width, height, mode, className);
    }

    public String showImage(Long seq, int width, int height, String className){
        return showImage(seq, null, width, height, "image", className);
    }

    public String showBackground(Long seq, int width, int height, String className){
        return showImage(seq, null, width, height, "background", className);
    }

    public String showImage(String url, int width, int height,  String className){
        return showImage(null, url, width, height, "image", className);
    }

    public String showBackground(String url, int width, int height, String className){
        return showImage(null, url, width, height, "background", className);
    }

    public String showImage(String url, int width, int height, String mode, String className){
        return showImage(null, url, width, height, mode, className);
    }

    public String showImage(Long seq, String url, int width, int height, String mode, String className) {

        try {
            String imageUrl = null;
            if (seq != null && seq > 0L) {
                FileInfo item = fileInfoService.get(seq);
                if (!item.isImage()) {
                    return "";
                }

                imageUrl = String.format("%s&width=%d&height=%d", item.getThumbUrl(), width, height);

            } else if (StringUtils.hasText(url)) {
                imageUrl = String.format("%s/api/file/thumb?url=%s&width=%d&height=%d", request.getContextPath(), url, width, height);
            }

            if (!StringUtils.hasText(imageUrl)) return "";

            mode = Objects.requireNonNullElse(mode, "image");
            className = Objects.requireNonNullElse(className, "image");
            if (mode.equals("background")) { // 배경 이미지

                return String.format("<div style='width: %dpx; height: %dpx; background:url(\"%s\") no-repeat center center; class= %s; background-size:cover;'></div>", width, height, imageUrl, className);
            } else { // 이미지 태그
                return String.format("<img src='%s' class='%s'>", imageUrl, className);
            }
        } catch (Exception e) {}

        return "";
    }
}