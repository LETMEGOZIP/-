package org.koreait.global.configs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeansConfig { // 수동 등록 빈 관리

    @Lazy
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Lazy
    @Bean
    public ModelMapper modelMapper() { // 같은 getter와 setter를 지닌
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        return mapper;
    }

    @Lazy
    @Bean
    public ObjectMapper objectMapper() { // rest컨트롤러
        ObjectMapper om = new ObjectMapper();
        om.registerModule(new JavaTimeModule()); // java8 data & time api - java.time 패키지

        return om;
    }
}
