import java.util.Scanner;

public class Pattern7 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enterh the number: ");
        int n=s.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        s.close();
    }    
}
