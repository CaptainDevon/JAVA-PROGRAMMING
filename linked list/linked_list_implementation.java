public class linked_list_implementation {

    public static void main(String[] args) {
        node head;
        int arr[] = { 1, 2, 3, 4, 5 };
        ll l = new ll(); // object creation technique
        head = l.inserting_the_array(arr);
        head = l.insert_at_beginnning(27);
        head = l.insert_at_end(9);
        head = l.insert_at_middle(10, 3);
        head = l.delete_at_beginnig();
        head = l.delete_at_end();
        head = l.delete_at_position(3);
        l.display(head);

    }
}

class node {
    int data;
    node next;

    node(int value) {
        this.data = value;
        this.next = null;
    }

    node(int value, node nxtptr) {
        this.data = value;
        this.next = nxtptr;
    }

}

class ll {
    public node head;

    node inserting_the_array(int arr[]) {

        head = new node(arr[0]);
        node mover = head;
        for (int i = 1; i < arr.length; i++) {
            mover.next = new node(arr[i]);
            mover = mover.next;
        }
        return head;
    }

    node insert_at_beginnning(int value) {
        node newnode = new node(value);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
        return head;
    }

    node insert_at_end(int value) {
        node newnode = new node(value);
        node ptr = head;
        if (head == null) {
            head = newnode;
        }
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = newnode;
        return head;
    }

    node insert_at_middle(int data, int pos) {
        node newnode = new node(data);
        node ptr = head.next;
        node prev = head;
        while (pos != 1) {
            prev = ptr;
            ptr = ptr.next;
            pos--;
        }
        newnode.next = prev.next;
        prev.next = newnode;

        return head;
    }

    /// deletion operation

    node delete_at_beginnig() {
        if (head == null) {
            System.out.println("not possible");
            return head;
        }
        head = head.next;
        return head;
    }

    node delete_at_end() {
        if (head == null) {
            System.out.println("not possible");
            return head;
        }
        if (head.next == null) {
            head.next = null;
        }
        node ptr = head;
        while (ptr.next.next != null) {

            ptr = ptr.next;
        }
        ptr.next = null;
        return head;
    }

    node delete_at_position(int pos) {
        node ptr = head.next;
        node prev = head;
        while (pos != 1) {
            ptr = ptr.next;
            prev = prev.next;
            pos--;
        }
        prev.next = ptr.next;
        return head;

    }

    void display(node head) {

        node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }
}
