import java.util.*;

public class iterator2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,5,3,6,-2,-7,0,8,11));
        Iterator<Integer> it=nums.iterator();
        System.out.println(nums);
        while(it.hasNext())
        {
            int num=it.next();
            if(num%2==0)
            {
                it.remove();
            }
        }
        System.out.println(nums);
    } 
}
