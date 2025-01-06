package org.koreait.member.repositories;

import org.koreait.member.Member;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface MemberRepository extends ListCrudRepository<Member, Long> {
    Member findByEmail(String email);
    List<Member> findByUsernameContainingOrderByDesc(String keyword);
}
