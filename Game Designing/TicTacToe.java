import java.util.*;
public class TicTacToe {
    public static void main(String args[])
    {
        System.out.println("Welcome to Tic Tac Toe !!!");
        Scanner s=new Scanner(System.in);
        Game g=new Game();
        char currChar;
        int count=0;
        while(count<9)
        {
            currChar=(count%2==0)? 'X':'O';
            System.out.print("Player "+currChar+", enter your move (row and column): ");
            int row=s.nextInt();
            int column=s.nextInt();
            if(column<1 || column>3 || row<1 || row>3)
            {
                System.out.println("Invalid move. Please enter row and column between 1 and 3.");
                continue;
            }
            if (!g.fillCell(row, column, currChar)) {
                continue;
            }
            g.display();
            if(g.winningCondition()) 
            {
                System.out.println("Player "+currChar+" Wins");
                break;
            }
            else
            {
                count++;
            }
        }
        if(count==9 && g.winningCondition()==false)
        {
            System.out.println("It's a tie!!");
        }
        s.nextLine();
        s.close();
    }
}

class Game
{
    private char[][] board;
    public Game()
    {
        this.board=new char[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                this.board[i][j]=' ';
            }
        }
    }

    public boolean winningCondition()
    {
        //diagonals
        if((board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) || (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])) 
        {
            return true;
        }
        //horizontal and vertical
        for (int i = 0; i < 3; ++i) 
        {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) 
            {
                return true;
            }
        }


        for (int j = 0; j < 3; ++j) 
        {
            if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) 
            {
                return true;
            }
        }

        return false;
    }

    public void display()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("| "+this.board[i][j]+" |");
            }
            System.out.println();
        }
    }

    public boolean fillCell(int row, int column, char playerChar) {
        if (board[row-1][column-1] == ' ') {
            this.board[row-1][column-1] = playerChar;
            return true;
        } else {
            System.out.println("Cell is already filled. Try again.");
            return false;
        }
    }
       
}
