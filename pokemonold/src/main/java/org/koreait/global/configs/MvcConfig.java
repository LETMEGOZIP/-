package org.koreait.global.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // 자동 스캔범위 포함 대상, 설정 파일에 주로 지정
@EnableJpaAuditing // JPA
@EnableScheduling // 스케줄링 활성화
@EnableRedisHttpSession // 레디스 세션 활성화
public class MvcConfig implements WebMvcConfigurer {
    /**
     * 정적 경로 설정, CSS, JS, 이미지
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/"); // classpath : 클래스 파일을 인식할 수 있는 경로, 스태틱에 있는걸 매핑하겠다
    }

    /**
     * PATCH, PUT, DELETE 등등
     * PATCH 메서드로 요청을 보내는 경우
     * <form method='POST' ...>
     *      <input type='hidden' name='_method' value='PATCH'>
     * </form>
     * @return
     */
    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        return new HiddenHttpMethodFilter();
    } //
}
