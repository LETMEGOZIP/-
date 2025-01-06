package org.koreait.member.repository;

import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 영구 저장 처리 또는 조회, 삭제 ..
 *
 */
public class MemberRepository {
    private static final Map<String, Member> members = new HashMap<>();

    @Autowired
    public void register(RequestJoin form) {
        String email = form.getEmail();

        Member member = new Member();
        member.setSeq(System.currentTimeMillis());
        member.setEmail(email);
        member.setPassword(form.getPassword());
        member.setUserName(form.getUserName());
        member.setRegDt(LocalDateTime.now());

        members.put(email, member);
    }
    @Autowired
    // 회원 전체 목록
    public List<Member> getList() {
        return new ArrayList<>(members.values());
    }
}