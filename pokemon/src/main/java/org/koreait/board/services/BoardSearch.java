package org.koreait.board.services;

import lombok.Data;
import org.koreait.global.paging.CommonSearch;

import java.util.List;

@Data
public class BoardSearch extends CommonSearch {
    private List<String> bid;
    private String sort; // 필드명_정렬방향 예) viewCount_DESC
    private List<String> email;
    private List<String> category; // 분류 조회
}
