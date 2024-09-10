public class Array {
    public static void main(String[] args) {
        int []arr=new int[3];
        arr[0]=2;
        arr[1]=3;
        arr[2]=5;
        System.out.println(arr[2]);
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);

        // for each loop
        int sum2=0;
        for(int value:arr)
        {
            sum2+=value;
        }
        System.out.println(sum2);
    }
}
