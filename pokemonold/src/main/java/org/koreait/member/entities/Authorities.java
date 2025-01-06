package org.koreait.member.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.koreait.member.constants.Authority;

import java.io.Serializable;

@Data
@Entity
@IdClass(AuthoritiesId.class)
public class Authorities implements Serializable {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @Id // 중복되는 권한은 부여 못하게 복합키로 만드려고 id 두개?
    @Enumerated(EnumType.STRING)
    @Column(length=15)
    private Authority authority;
}
