import java.util.*;

public class LearningPriorityQueue {
    public static void main(String[] args) {
        //puts element in sorted order
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(12);
        pq.offer(3);
        pq.offer(4);
        pq.offer(0);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);

        //puts in the reverse order
        PriorityQueue<Integer> pqr = new PriorityQueue<>(Comparator.reverseOrder());
        pqr.offer(12);
        pqr.offer(3);
        pqr.offer(4);
        pqr.offer(0);
        System.out.println(pqr);
        System.out.println(pqr.peek());
        System.out.println(pqr.poll());
        System.out.println(pqr);
    }
}
