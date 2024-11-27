import java.util.*;

public class SumOfNaturalNumbers {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = s.nextInt();
        int sum = sumOfNaturalNumbers(n);
        System.out.println("The sum of "+n+" Number is : "+sum);
        s.close();
    }

    public static int sumOfNaturalNumbers(int n) {

        if(n==0)return 0;
        
        return n+sumOfNaturalNumbers(n-1);
    }
}
