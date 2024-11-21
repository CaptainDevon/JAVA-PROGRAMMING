import java.util.Scanner;

public class Pattern6 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i-1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
