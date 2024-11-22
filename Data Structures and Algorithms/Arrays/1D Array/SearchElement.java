import java.util.*;

public class SearchElement {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=s.nextInt();              //size of the array
        int []array=new int[n];
        System.out.print("Enter the element in array: ");
        for(int i=0;i<array.length;i++)
        {
            array[i]=s.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int x=s.nextInt();
        System.out.println("The position is: "+searching(array,x));
        s.close();
    }

    static int searching(int[] array,int x)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==x)
            {
                return i;
            }
        }
        return 0;
    }
}
