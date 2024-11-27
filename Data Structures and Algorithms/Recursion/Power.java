import java.util.*;
public class Power 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n=s.nextInt();
        System.out.print("Enter the power: ");
        int x=s.nextInt();
        System.out.println("The power value is: "+pow(n,x));
        s.close();
    }

    public static int pow(int n,int x)
    {
        if(x==0)return 1;
        return n*pow(n,x-1); 
    }
}
