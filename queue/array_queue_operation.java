package queue;

public class array_queue_operation {

    public static void main(String[] args) {
        queue q = new queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.peek();
    }
}

class queue {
    int arr[];
    int capacity;
    int front;
    int rear;

    queue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = -1;
        this.rear = -1;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("not possible");
            return;
        }
        if (front == -1) {
            front++;
        }
        arr[++rear] = data;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("not possible");
            return -1;
        }
        int data = arr[front];
        front++;
        return data;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("not possible");
            return -1;
        }
        return arr[front];
    }

    boolean isFull()

    {
        return rear == (capacity - 1);
    }

    boolean isEmpty() {
        return front == -1;
    }
}
