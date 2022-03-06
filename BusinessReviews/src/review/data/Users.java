package review.data;

public class Users {
    String login,password;
    public Users(String login,String password)
    {
        this.login=login;
        this.password=password;
    }
    public String getLogin()
    {
        return login;
    }
    public String getPassword()
    {
        return password;
    }
}
