import java.util.*;

public class FactorialOfANumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        int res=factorial(n);
        System.out.println("The factorial of the number "+n+" is: "+res);
        s.close();
    }

    public static int factorial(int n)
    {
        if(n==0)return 1;
        return n*factorial(n-1);
    }
}
