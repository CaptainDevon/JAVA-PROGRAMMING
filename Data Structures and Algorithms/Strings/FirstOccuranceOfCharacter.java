import java.util.*;
public class FirstOccuranceOfCharacter {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=s.nextLine();
        System.out.print("Enter the character: ");
        char ch=s.nextLine().charAt(0);
        System.out.println("The required character is found at: "+firstOccurance(str,ch));
        s.close();
    }    

    public static int firstOccurance(String s,char c)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            
                return i+1;
            
        }
        return -1;
    }
}
