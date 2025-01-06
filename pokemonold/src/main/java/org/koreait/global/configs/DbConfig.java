package org.koreait.global.configs;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class DbConfig {
    @PersistenceContext
    private EntityManager em;

    @Lazy
    @Bean
    public JPAQueryFactory jpaQueryFactory(){ // 복잡한 Query DS 처리
        return new JPAQueryFactory(em);
    }
}
