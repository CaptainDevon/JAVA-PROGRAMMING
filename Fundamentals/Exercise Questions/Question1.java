import java.util.*;

public class Question1 {

    static int averageOfNumbers(int a,int b,int c)
    {
        return (a+b+c)/3;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Select three numbers ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        System.out.println("The average of these numbers are: "+averageOfNumbers(a, b, c));
        s.close();
    }    
}
