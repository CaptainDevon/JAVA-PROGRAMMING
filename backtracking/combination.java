package backtracking;
import java.util.*;
public class combination
{
    static Vector<Vector<Integer>> ans = new Vector<Vector<Integer>>();
    static Vector<Integer> tmp = new Vector<Integer>();
       
    static void makeCombiUtil(int n, int left, int k)
    {
       
        
        if (k == 0) {
            ans.add(tmp);
            for(int i = 0; i < tmp.size(); i++)
            {
                System.out.print(tmp.get(i) + " ");
            }
            System.out.println();
            return;
        }
  
      
        for (int i = left; i <= n; ++i)
        {
            tmp.add(i);
            makeCombiUtil(n, i + 1, k - 1);
  
          
            tmp.remove(tmp.size() - 1);
        }
    }
  
    
    static Vector<Vector<Integer>> makeCombi(int n, int k)
    {
        makeCombiUtil(n, 1, k);
        return ans;
    }
     
    public static void main(String[] args)
    {
       
        
        int n = 5;
        int k = 3;
        ans = makeCombi(n, k);
    }
}