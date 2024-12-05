public class ImplementationUsingLinkedList {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.displayStack();
        int top = s.top();
        int popVal = s.pop();
        System.out.println(top);
        System.out.println(popVal);
        s.displayStack();
    }
}

class Node {
    private int data;
    private Node next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }

    public int Data() {
        return this.data;
    }

    public Node Next() {
        return this.next;
    }

    public void setNext(Node ptr) {
        this.next = ptr;
    }

}

class Stack {
    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int val) {
        Node newNode = new Node(val);
        newNode.setNext(head);
        head=newNode;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int n = head.Data();
        head = head.Next();
        return n;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return head.Data();
    }

    public void displayStack() {
        Node ptr = head;
        while (ptr!= null) {
            System.out.print(ptr.Data() + " ");
            ptr = ptr.Next();
        }
        System.out.println();
    }
}