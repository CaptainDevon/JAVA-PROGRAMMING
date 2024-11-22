import java.util.*;

public class Question10 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int first = 0, second = 1;
            System.out.print("Fibonacci Sequence: " + first);

            for (int i = 1; i < n; i++) {
                System.out.print(", " + second);
                int next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        }

        scanner.close();
    
    }
}
