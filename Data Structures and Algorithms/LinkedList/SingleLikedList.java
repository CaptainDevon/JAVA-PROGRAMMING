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

    // diaplay of linked list
    public void display() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.Data() + " ");
            ptr = ptr.Next();
        }
        System.out.println();
    }

    // insertion of linked list
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

    public void insertInBetween(int val, int pos) {
        Node newNode = new Node(val);
        Node ptr = head;
        while (pos-- > 0) {
            ptr = ptr.Next();
        }
        newNode.setNext(ptr.Next());
        ptr.setNext(newNode);
    }

    // deletion operations
    public void deleteFirst() {
        Node ptr = head;
        head = head.Next();
        ptr.setNext(null);
    }

    public void deleteEnd() {
        Node ptr = head;
        Node ptrp = head;
        while (ptr.Next() != null) {
            ptr = ptr.Next();
        }
        while (ptrp.Next() != ptr) {
            ptrp = ptrp.Next();
        }
        ptrp.setNext(null);
    }

    public void deleteInMiddle(int pos) {
        Node ptr = head;
        while (pos-- > 0) {
            ptr = ptr.Next();
        }
        ptr.setNext(ptr.Next().Next());

    }
}
