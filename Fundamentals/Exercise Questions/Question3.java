import java.util.*;
public class Question3 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=s.nextInt();
        int b=s.nextInt();

        System.out.println("The greatest number is : "+greatestNumber(a, b));
        s.close();
    }

    static int greatestNumber(int a,int b)
    {
        return (a>b) ? a:b;
    }
}
