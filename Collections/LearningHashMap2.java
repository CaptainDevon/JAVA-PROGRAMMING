import java.util.*;

public class LearningHashMap2 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(1,1,2,4,5,6,3,2,1));
        for(int i=0;i<arr.size();i++)
        {
            int val=arr.get(i);
            if(!mpp.containsKey(val))
            {
                mpp.put(val, 1);
            }
            else
            {
                mpp.put(val,mpp.get(val)+1);
            }
        }
        System.out.println(mpp);
        System.out.println(mpp.keySet());
        System.out.println(mpp.values());
    }
}
