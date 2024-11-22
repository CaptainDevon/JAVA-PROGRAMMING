import java.util.*;

public class Questions7 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int pos = 0, neg = 0, zero = 0;
        while (true) {
            System.out.print("Enter the number: ");
            int x = s.nextInt();
            if (x < 0)
                neg++;
            else if (x == 0)
                zero++;
            else
                pos++;

            System.out.println("Wanna continue? y | n");
            char c = s.next().charAt(0);
            if (c == 'y')
                continue;
            else
                break;
        }

        System.out.println("Postive: " + pos + " Negative: " + neg + " Zero: " + zero);
        s.close();
    }
}
