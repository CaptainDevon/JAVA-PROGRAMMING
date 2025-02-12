import java.util.*;
public class RockPaperScissors {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("welcome to Rock Paper Scissors");
        System.out.println("SIMPLE RULES =>");
        System.out.println("Rock beats Scissors");
        System.out.println("Scossors beats Paper");
        System.out.println("Paper beats Rock");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("0 = Rock        1 = Paper       2 = Scissors");
        
        while(true)
        {
            System.out.print("type the choice you want: ");
            Random random=new Random();
            int player=s.nextInt();
            int computer=random.nextInt(3);
            if(player>2){System.out.println("Invalid Choice");}
            else
            {
                if(player>computer)
                {
                    if(player==2 && computer==0)
                    {
                        System.out.println("Computer Wins");

                    }
                    else
                    {
                        System.out.println("Player Wins");
                    }
                }
                else if(player==computer)
                {
                    System.out.println("It's a tie");
                }
                else
                {
                    System.out.println("Computer Wins");
                }
            }

            System.out.println("Wanna Continue? (y or n): ");
            char choice=s.next().charAt(0);
            if(choice=='n') break;
        }

        s.close();
    }
}


