import java.util.*;

public class ImplementationUsingArrayList {
    public static void main(String[] args) {
        ArrStack s=new ArrStack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.stackDisplay();
        System.out.println(s.top());
        System.out.println(s.pop());
        s.stackDisplay();

    }
}

class ArrStack {
    private ArrayList<Integer> stack = new ArrayList<>();

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public void push(int val) {
        stack.add(val);
    }

    public int top() {
        return stack.get(0);
    }

    public int pop() {
        int res = stack.get(0);
        stack.remove(0);
        return res;
    }

    public void stackDisplay() {
        System.out.println(stack);
    }

}
