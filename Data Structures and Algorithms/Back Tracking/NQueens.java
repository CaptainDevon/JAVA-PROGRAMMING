import java.util.*;

public class NQueens {
    public static void main(String[] args) {

        int n = 8;
        System.out.println(solveNQueen(n));
    }

    public static List<List<String>> solveNQueen(int n) {
        List<List<String>> resultBoard = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, resultBoard, 0);
        return resultBoard;
    }

    public static void helper(char[][] board, List<List<String>> resultBoard, int col) {
        for (int row = 0; row < board.length; row++) {
            if (col == board.length) {
                saveBoard(board, resultBoard);
                return;
            }
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, resultBoard, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(int row, int col, char[][] board) {
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q')
                return false;
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q')
                return false;
        }
        r = row;
        for (int c = col; c < board.length & r >= 0; r--, c++) {
            if (board[r][c] == 'Q')
                return false;
        }
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--)
        {
            if (board[r][c] == 'Q')
                return false;
        }
        row=r;
        for(int c=col;c<board.length && r<board.length;r++,c++)
        {
            if (board[r][c] == 'Q')
                return false;
        }
            return true;
    }

    public static void saveBoard(char[][]board,List<List<String>> resultBoard)
    {
        
        List<String>chessBoard=new ArrayList<>();
        for(int i=0;i<board.length;i++)
        {
            String row="";
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j]=='Q')row+='Q';
                else row+='.';
            }
            chessBoard.add(row);
        }
        resultBoard.add(chessBoard);

    }

}
