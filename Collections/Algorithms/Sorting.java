import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,5,3,6,-2,-7,0,8,11));
        Collections.sort(nums);
        System.out.println(nums);
    }
}
