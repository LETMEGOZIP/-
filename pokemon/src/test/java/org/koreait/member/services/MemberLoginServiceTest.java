package org.koreait.member.services;

import jakarta.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.mockito.BDDMockito.*;

import static org.mockito.Mockito.mock;

@SpringBootTest
@ActiveProfiles({"default", "test"})
public class MemberLoginServiceTest {
    private MemberLoginService service;

    @Mock // mock 어노테이션 있으면 알아서 가짜 객체 생성
    private HttpServletRequest request;

    @BeforeEach
    void init(){
        // request = mock (HttpServletRequest.class); // 가짜 객체
        given(request.getParameter("email")).willReturn("user01@tets.org");
        given(request.getParameter("password")).willReturn("1231254");
        service = new MemberLoginService(request);
    }

    @Test
    void test1(){
        service.process();

        then(request).should(atLeast(1)).getParameter(any());
    }

    @Test
    void test2(){
        service.process();

        ArgumentCaptor<String> captor1 = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<String> captor2 = ArgumentCaptor.forClass(String.class);

        then(request).should(times(2)).setAttribute(captor1.capture(), captor2.capture());

        List<String> key = captor1.getAllValues();
        List<String> value = captor2.getAllValues();
        System.out.printf("%s, %s%n", key, value);
    }
}
