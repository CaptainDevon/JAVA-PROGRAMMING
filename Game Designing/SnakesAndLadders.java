import java.util.*;

public class SnakesAndLadders {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number of players: ");
        int n=s.nextInt();
        Game g=new Game(n);
        g.gameInformation();
        g.playground();
        s.nextLine();
        s.nextLine();
        s.close();
    }
}

class Board
{
    protected Map<Integer,Integer>snakes;
    {
        snakes = new HashMap<>();
        snakes.put(16, 6);
        snakes.put(48, 26);
        snakes.put(49, 16);
        snakes.put(64, 60);
        snakes.put(87, 24);
        snakes.put(93, 73);
        snakes.put(98, 78);
    }

    protected Map<Integer,Integer>ladders;
    {
        ladders=new HashMap<>();
        ladders.put(4,14);
        ladders.put(9,31);
        ladders.put(21,42);
        ladders.put(28,84);
        ladders.put(51,67);
        ladders.put(71,91);
        ladders.put(80,97);
    }
}

class Game extends Board
{
    private int[] players;

    private int getRandomNumber()
    {
        Random r=new Random();
        return r.nextInt(6)+1;
    }

    private int snakeBite(int tile) 
    {
        return snakes.getOrDefault(tile, tile);
    }

    private int ladderClimb(int tile)
    {
        return ladders.getOrDefault(tile, tile);
    }

    private void scoreDisplay()
    {
        for(int i=0;i<players.length;i++)
        {
            System.out.print(players[i]+" ");
        }
        System.out.println();
    }

    private void playTurn(int i) {
        int number = getRandomNumber();
        
        if (this.players[i] + number <= 100) {
            this.players[i] += number;
        }
        
        int snakePosition = snakeBite(this.players[i]);
        if (snakePosition != this.players[i]) {
            System.out.println("Snake bite!! phisssssss...");
            this.players[i] = snakePosition;
        }
        
        int ladderPosition = ladderClimb(this.players[i]);
        if (ladderPosition != this.players[i]) {
            System.out.println("Wao!! you found a ladder...");
            this.players[i] = ladderPosition;
        }
    }

    private boolean winCondition(int tile)
    {
        if(tile==100)
        {
            return true;
        }
        return false;
    }

    public Game(int players)
    {
        this.players=new int[players];
    }

    public void gameInformation()
    {
        System.out.println("Welcome to Snakes and Ladders!");
        System.out.println("1. The game is played on a board with 100 numbered squares.");
        System.out.println("2. Players take turns rolling a die to move forward.");
        System.out.println("3. Landing on a ladder moves the player up to a higher square.");
        System.out.println("4. Landing on a snake moves the player down to a lower square.");
        System.out.println("5. The first player to reach square 100 wins the game.");
        System.out.println("6. If a roll exceeds 100, the player stays in place.");
        System.out.println("7. The game requires at least two players.");
        System.out.println("8. Good luck and have fun!");
    }

    public void playground()
    {
        while(true)
        {
            int stopper=0;
            for(int i=0;i<players.length;i++)
            {
                playTurn(i);
                if(winCondition(this.players[i]))
                {
                    stopper+=1;
                    System.out.println("player number "+(i+1)+" is the Winner!! congratulations...");
                    break;
                }
            }
            scoreDisplay();
            if(stopper==1)break;
        }
    }
}
