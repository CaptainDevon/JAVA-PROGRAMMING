import java.util.*;

public class BubbleSort {

    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        System.out.println("Before sorting: "+nums);
        bubbleSort(nums);
        System.out.println("After sorting: "+nums);
    }

    public static  void bubbleSort(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size() - i - 1; j++) {
                if (nums.get(j) > nums.get(j + 1)) {

                    int temp = nums.get(j);
                    nums.set(j, nums.get(j + 1));
                    nums.set(j + 1, temp);
                }
            }
        }
        

    }
}
