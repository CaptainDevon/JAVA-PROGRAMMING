import java.util.*;
public class Question5 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=s.nextInt();
        eligibleToVote(age);
        s.close();
    }
    static void eligibleToVote(int age)
    {
        System.out.println(age>=18 ? "eligible to vote!": "Not eligible to vote!" );
    }
}
