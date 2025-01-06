package org.board.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping(path = {"/list", "/list/{bid}"})
    public String list(@PathVariable("id") String id){ // 경로 변수
        System.out.printf("bid=%s%n", id);
        return "board/list";
    }

    @GetMapping("/write/{bid}")
    public  String write(@PathVariable("id") String id){
        System.out.printf("bid=%s%n", id);
        return "board/write";
    }

    @PostMapping("/write/{bid}")
    public  String writePS(){
        return "board/write";
    }

    @GetMapping("/join/{bid}")
    public  String join(){
        return "board/join";
    }

    @PostMapping("/join/{bid}")
    public  String joinPS(){
        /*
          회원 가입 처리 완료 후 주소 이동(로그인 페이지)
          응답 헤더 Location : /springweb/member/login
          response.sendRedirect(request.getContextPath() + "/member/login");
         */
        return "board/join";
    }
}

