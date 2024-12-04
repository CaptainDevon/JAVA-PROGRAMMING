public class InsertionSort {
    public static void main(String args[])
    {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        insertionSort(arr,arr.length-1);
        for(int it:arr)
        {
            System.out.print(it+" ");
        }
    }
    public static void insertionSort(int[]arr,int n)
    {
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]>arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
