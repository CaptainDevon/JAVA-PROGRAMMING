import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n=s.nextInt();

        for(int i=0;i<n;i++)
        {
            if(i==0 || i==n-1)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else 
            {
                for(int j=0;j<n;j++)
                {
                    if(j==0 || j==n-1)
                    {
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
        s.close();
    }
}
