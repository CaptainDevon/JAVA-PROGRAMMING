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
