package org.koreait.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;

@Controller
@RequestMapping("/member")
public class MemberController {
    //@GetMapping("/member")
//    @RequestMapping(path={"/member/login", "/user/login/"}, method = {RequestMethod.GET, RequestMethod.POST})
//    public String login(){
//        System.out.println("로그인 페이지 유입");
//        return "member/form";
//    }

    @GetMapping("/login")
    //@GetMapping(path = "/login", params={"type"})

    // headers는 요청 헤더에 Authorization이 있는 경우만 유입
    //@GetMapping(path="/login", headers = "Authorization")

    // 응답헤더 Content-type = application
    //@GetMapping(path = "/login", produces = "application/json")
    public String login(){
        System.out.println("로그인 양식");
        return "member/form";
    }

    @PostMapping("/login")
    public String loginPs(){
        return "member/form";
    }

    @GetMapping("/join")
    public  String join(){
        return "member/joinform";
    }

    @PostMapping("/join")
    public  String joinPS(RequestJoin form /*,  Model model */){ // 회원 가입 처리
        System.out.println(form); // 커맨드 객체는 자동으로 EL 속성으로 추가, 속성명이 클래스명, 앞자는 소문자 RequestJoin -> requestJoin
//        model.addAttribute("requestJoin", form);
//        String[] hobby = form.getHobby();
//        System.out.println(Arrays.toString(hobby));
//        return "redirect:/member/login";
//   RequestDispatcher rd = request.getRequestDispatcher ("...."); rd.forward(request, response);
        return "forward:/member/login";
    }
}