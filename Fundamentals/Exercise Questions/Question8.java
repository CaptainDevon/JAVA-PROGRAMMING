import java.util.*;
public class Question8 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int x=s.nextInt();
        int n=s.nextInt();
        int prod=1;
        while(n>0)
        {
            prod*=x;
            n--;
        }
        System.out.println("The value is: "+prod);
        s.close();
    }    
}
