public class Main {
    public static void main(String[] args) {
        System.out.println("Singly Linked List operations: ");
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
        head.deleteFirst();
        head.display();
        head.deleteEnd();
        head.display();
        head.deleteInMiddle(3);
        head.display();
    }
}
