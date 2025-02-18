import java.util.*;
public class NumberGuessingGame {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        Random random=new Random();
        int computerValue=random.nextInt(10);
        
        while(true)
        {
            System.out.print("Guess The Number: ");
            int playerValue=s.nextInt();
            if(playerValue>computerValue)
            {
                System.out.println("Too High!");
            }
            else if(playerValue<computerValue)
            {
                System.out.println("Too Low!");
            }
            else 
            {
                System.out.println("You have Guessed the number correctly");
                break;
            }
        }
        System.out.println("press enter to exit");
        s.nextLine();
        s.close();
    }
}
