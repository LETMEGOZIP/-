package org.koreait.member.social.entities;

import lombok.Data;

@Data
public class SocialConfig {
    private String kakaoRestApiKey;
    private boolean useKakaoLogin; //카카오 로그인 여부
}
