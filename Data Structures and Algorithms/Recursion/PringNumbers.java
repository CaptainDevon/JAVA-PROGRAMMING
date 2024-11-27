import java.util.*;
public class PringNumbers {
       public static void main(String args[])
       {
            System.out.print("Select any number: ");
            Scanner scan=new Scanner(System.in);
            int n=scan.nextInt();
            printNumber(n);
            scan.close();
       } 

       public static void printNumber(int n)
       {
        if(n==0)return ;
        System.out.print(n+" ");
        printNumber(n-1);
       }
}
