import java.util.*;
public class SubsetOfNNaturalNumbers {
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        findSubset(n, subset);
    }
    
    public static void findSubset(int n,ArrayList<Integer> subset)
    {
        if(n==0)
        {
            printSubs(subset);
            return;
        }
        subset.add(n);
        findSubset(n-1, subset);

        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
    }

    public static void printSubs(ArrayList<Integer> subset)
    {
        for(int i=0;i<subset.size();i++)
        {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
}
