import java.util.*;
public class ReversingAStack {
    public static void main(String args[])
    {
        Stack<Integer>s=new Stack<>();
        Stack<Integer>revS=new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println("Original Stack: "+s);
        while(!s.isEmpty())
        {
            revS.push(s.pop());
        }
        System.out.println("Reversed Stack: "+revS);
    }
}
