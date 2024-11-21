import java.util.Scanner;

public class Pattern9 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int n = s.nextInt();

        while(n>=0)
        {
            for(int i=1;i<=n;i++)
            {
                System.out.print(i);
            }
            System.out.println();
            n--;
        }
        s.close();
    }
}
