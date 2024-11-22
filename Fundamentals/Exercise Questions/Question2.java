import java.util.*;

public class Question2 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=s.nextInt();

        System.out.println("The sum of odd numbers between 1 and "+n+ " is: "+oddSum(n));
        s.close();
    }

    static int oddSum(int n)
    {
        int oddSum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                oddSum+=i;
            }
        }
        return oddSum;
    }
}
