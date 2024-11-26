import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        System.out.println("Before Sorting: " + Arrays.toString(nums));
        selectionSort(nums);
        System.out.println("After Sorting: " + Arrays.toString(nums));
    }

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
