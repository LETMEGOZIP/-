package org.koreait.member.social.services;

public interface SocialLoginService {
    String getToken(String code);
    Boolean login(String token);
    String getLoginUrl(String redirectUrl);
    void connect(String token);
    void disconnect();
    void exists(String token);
}
