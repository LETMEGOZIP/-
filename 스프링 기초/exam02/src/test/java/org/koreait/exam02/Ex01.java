package org.koreait.exam02;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx3;
import org.koreait.global.configs.AppCtx4;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.services.InfoService;
import org.koreait.member.services.JoinService;
import org.koreait.member.validators.JoinValidator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx4.class);
        // 객체 생성 -> 의존 설정
        JoinService joinService = ctx.getBean(JoinService.class);
        InfoService infoService = ctx.getBean(InfoService.class);
        JoinValidator joinValidator = ctx.getBean(JoinValidator.class);

        RequestJoin form = new RequestJoin();
        form.setEmail("uwsser1@test.org");
        form.setPassword("12312423");
        form.setConfirmPassword("12312423");
        form.setUserName("사용자01");
        form.setAgree(true);

        joinService.process(form);
        infoService.print();
        ctx.close();
    }
}
