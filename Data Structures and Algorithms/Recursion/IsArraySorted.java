public class IsArraySorted {
    public static void main(String args[])
    {
        int []arr={1,2,3,4,5};
        int []arr2={-1,6,15,7,8,11,0};
        System.out.println(isSorted(arr,0));
        System.out.println(isSorted(arr2,0));
    }

    public static boolean isSorted(int[] arr,int index)
    {
        if(index==arr.length-1)return true;
        if(arr[index]>arr[index+1])
        {
            return false;
        }
        return isSorted(arr,index+1);
    }
}
