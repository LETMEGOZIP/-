package org.koreait.board.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Data
@Entity
@IdClass(BoardViewId.class)
public class BoardView {
    @Id
    private long seq; // 게시글 번호
    @Id
    private int hash; // 회원번호 또는 ip + user-agent로 조합해서 생성
}
