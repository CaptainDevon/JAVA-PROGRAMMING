import java.util.*;

public class Question9 {
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter two number: ");
        int a=s.nextInt(),b=s.nextInt();
        System.out.println("The GCD of the numbers "+a+" and "+b+" is: "+findGCD(a, b));

        s.close();
    }

    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
