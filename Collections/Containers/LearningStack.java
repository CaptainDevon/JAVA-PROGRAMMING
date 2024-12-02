import java.util.*;

public class LearningStack {
    public static void main(String[] args) {
       Stack<Integer> s= new Stack<>();
       s.push(1);
       s.push(2);
       s.push(3);
       s.push(4);
       System.out.println(s);
       System.out.println(s.peek());
       System.out.println(s.pop());
       s.pop();
       System.out.println(s);

       //we ca do these as it inherits the properties of the vector class
       /*s.add(20);
       System.out.println(s);
       s.add(3,10);
       System.out.println(s);*/
    }
}
