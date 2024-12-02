import java.util.*;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 5, 3, 6, -2, -7, 0, 8, 11));
        Iterator<Integer> it=nums.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
