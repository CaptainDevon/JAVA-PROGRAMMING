package array;

public class reversearray {
    
    static void reverse(int nums[])
    {
        int start=0;
        int last=nums.length-1;
        while(start<last)
        {
            int temp=nums[start];
            nums[start]=nums[last];
            nums[last]=temp;
            start++;
            last--;
        }

    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        reverse(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    
}
