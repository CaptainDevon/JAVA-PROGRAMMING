package backtracking;
import java.util.ArrayList;
import java.util.List;
public class subset {

    static boolean flag=false;

    static void printsubsetsum(int i,int n,int[] set,int targetsum,List<Integer>subset)
    {
        if(targetsum==0) {
            flag=true;
            System.out.print("[ ");
            for(int j=0;j<subset.size();j++)
            {
                System.out.print(subset.get(j)+" ");
            }
            System.out.print("]");
            return;
        }
        if(i==n)
        {
            return;
        }
        printsubsetsum(i+1, n, set, targetsum, subset);
        if(set[i]<=targetsum)
        {
            subset.add(set[i]);

            printsubsetsum(i+1, n, set, targetsum-set[i], subset);
            subset.remove(subset.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] set1 = { 1, 2, 1 };
        int sum1 = 3;
        int n1 = set1.length;
        List<Integer> subset1 = new ArrayList<>();
        System.out.println("Output 1:");
        printsubsetsum(0, n1, set1, sum1, subset1);
        System.out.println();
        flag = false;
 
        // Test case 2
        int[] set2 = { 3, 34, 4, 12, 5, 2 };
        int sum2 = 30;
        int n2 = set2.length;
        List<Integer> subset2 = new ArrayList<>();
        System.out.println("Output 2:");
        printsubsetsum(0, n2, set2, sum2, subset2);
        if (!flag) {
            System.out.println("There is no such subset");
    }
}
}
