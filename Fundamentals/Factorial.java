import java.util.*;

public class Factorial {
    public static int factorial(int n)
    {
        int res=1;
        if(n<0)return -1;
        while(n>0)
        {
            res*=n;
            n--;
        }

        return res;
    }

    public static int bottomUpFactorial(int n) {
        if (n < 0)
            return -1;
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        System.out.println(factorial(n));
        System.out.println(bottomUpFactorial(n));
        s.close();
    }

}
