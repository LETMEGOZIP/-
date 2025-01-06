package org.koreait.exam01.main;

import org.junit.jupiter.api.Test;
import org.koreait.exam01.Greeter;
import org.koreait.exam01.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class); // 애노테이션 탐색
        Greeter g1 = ctx.getBean("greeter", Greeter.class);

        /**
         * AnnotationConfig : 설정 방식
         * ApplicationContext : 스프링 컨테이너
         */
        g1.hello("연우");

        Greeter g2 = ctx.getBean("Greeter", Greeter.class);

        System.out.println(g1==g2); // 싱글톤 형태로 객체를 관리
        ctx.close();
    }
}
