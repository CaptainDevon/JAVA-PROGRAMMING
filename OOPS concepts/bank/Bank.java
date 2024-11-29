package bank;

public class Bank {
    public static void main(String[] args) {
        Account account1=new Account();
        account1.name="Divyansh Sinha";
        //account1.email"divyansh2004ind@gmail.com";    cant do this
        //account.password="dhajkdshdjadw";             cant do this either
        account1.setPassword("Blabla0912");
        System.out.println(account1.getpassword());
    }
}
