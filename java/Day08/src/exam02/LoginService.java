package exam02;

public class LoginService {
    public void process (String userID, String password) throws UserIdValidationException, PasswordValidationException {
        //userID - user01, password - 1234

        if (!userID.equals("user01")) { //user01과 불일치
            throw new UserIdValidationException("아이디가 일치하지 않습니다");
        }

        if (!password.equals("1234")) {
            throw new PasswordValidationException("비밀번호가 일치하지 않습니다");
        }
    }
}
