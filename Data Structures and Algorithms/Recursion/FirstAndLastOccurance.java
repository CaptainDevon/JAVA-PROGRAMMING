import java.util.*;
public class FirstAndLastOccurance {
    public static int first=-1;
    public static int last=-1;
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=s.nextLine();
        findOccurance(str, 0, 'a');
        s.close();
    }

    public static void findOccurance(String s,int index,char element)
    {
        if(index==s.length())
        {
            System.out.println("First Occurance: "+first);
            System.out.println("last occurance: "+last);
            return;
        }
        char currChar=s.charAt(index);
        if(currChar==element)
        {
            if(first==-1)first=index;
            else last=index;
        }

        findOccurance(s, index+1, element);
    }
}
