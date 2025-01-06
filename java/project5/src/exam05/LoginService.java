package exam05;

public class LoginService {
    private static LoginService instance = new LoginService();
    private LoginService(){}

    public static LoginService getInstance(){
        if(instance==null){
            instance=new LoginService();
        }

        return instance;
    }

    public void login(String userID, String password){
    }
}
