import java.util.*;
public class PrintNumberInReverse {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Select the number: ");
        int n=s.nextInt();
        printNumberInReverse(n);
        s.close();
    }

    public static void printNumberInReverse(int n)
    {
        if(n==0)return;
        printNumberInReverse(n-1);
        System.out.print(n+" ");
    }
}
