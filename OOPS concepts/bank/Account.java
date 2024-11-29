package bank;


public class Account {
    public String name;
    protected String email;
    private String password;

    public String getpassword() {
        return this.password;
    }

    public void setPassword(String newPassword)
    {
        this.password=newPassword;
    }
}  

