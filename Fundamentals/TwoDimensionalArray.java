import java.util.*;
public class TwoDimensionalArray {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row=s.nextInt();
        System.out.print("Enter the number of colums: ");
        int column=s.nextInt();

        int [][]matrix=new int[row][column];
        System.out.print("Enter "+row*column+" Elements: ");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                matrix[i][j]=s.nextInt();
            }
        }

        for(int []i:matrix)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        s.close();
    }
}
