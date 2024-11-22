import java.util.*;

public class SearchIn2DArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int n = s.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        System.out.print("Enter the element to search: ");
        int x = s.nextInt();
        searchIn2DArray(x, matrix);
        s.close();

    }

    static void searchIn2DArray(int x, int[][] matrix) {
        int row = -1, column = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                if (matrix[i][k] == x) {
                    row = i;
                    column = k;
                    break;
                }
            }
        }

        if (row == -1 && column == -1)
            System.out.println("Element not found");
        else
            System.out.println("The element was found at " + row + " row and " + column + " column");
    }
}
