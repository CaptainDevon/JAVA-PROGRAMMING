import java.util.*;

public class TowerOfHenoi {
    public static void main(String srgs[]) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of disk: ");
        int n=s.nextInt();
        towerOfHenoi(n, "S", "H", "D");
        s.close();
    }

    public static void towerOfHenoi(int numberOfDiscks, String src, String helper, String dest) {
        if (numberOfDiscks == 1) {
            System.out.println("transfer disk " + numberOfDiscks + " from " + src + " to " + dest);
            return;
        }
        towerOfHenoi(numberOfDiscks - 1, src, dest, helper);
        System.out.println("transfer disk " + numberOfDiscks + " from " + src + " to " + dest);
        towerOfHenoi(numberOfDiscks - 1, helper, src, dest);

    }
}
