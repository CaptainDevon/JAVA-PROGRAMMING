import java.util.*;

public class LearningDeQueue {
    public static void main(String args[]) {
        // double ended queue
        Deque<Integer> adq = new ArrayDeque<>();
        adq.offer(1);
        adq.offer(2);
        adq.offerLast(3);
        adq.offerFirst(4);
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
        System.out.println(adq);
    }
}
