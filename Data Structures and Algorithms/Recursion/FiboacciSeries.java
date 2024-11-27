import java.util.*;
public class FiboacciSeries {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n=scan.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.print(fibonacci(i)+" ");
        }
        
        scan.close();
    }

    public static int fibonacci(int n)
    {
        if(n==0) return 0;
        else if(n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
