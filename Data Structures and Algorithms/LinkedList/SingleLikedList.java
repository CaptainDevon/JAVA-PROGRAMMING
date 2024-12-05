public class SingleLikedList {
    public static void main(String[] args) {
        ListOperations head = new ListOperations();
        head.insertFirst(0);
        head.insertFirst(1);
        head.insertFirst(2);
        head.insertFirst(3);
        head.insertFirst(4);
        head.insertFirst(6);
        head.insertEnd(10);
        head.insertInBetween(-1, 5);
        head.display();
    }
}

class Node {
    private int data;
    private Node next;

    public Node(int val) {
        this.data = val;
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

class ListOperations {
    private Node head;

    public void display() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.Data() + " ");
            ptr = ptr.Next();
        }
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);

        newNode.setNext(head);
        head = newNode;
    }

    public void insertEnd(int val) {
        Node newNode = new Node(val);
        Node ptr = head;
        if (head == null)
            head = newNode;
        while (ptr.Next() != null) {
            ptr = ptr.Next();
        }
        ptr.setNext(newNode);
    }

    public void insertInBetween(int val,int pos)
    {
        Node newNode=new Node(val);
        Node ptr=head;
        while(pos-->0)
        {
            ptr=ptr.Next();
        }
        newNode.setNext(ptr.Next());
        ptr.setNext(newNode);
    }
}
