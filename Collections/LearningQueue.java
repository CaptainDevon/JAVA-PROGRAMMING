import java.util.*;

public class LearningQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(2);
        q.add(4);
        q.add(3);
        q.offer(10);
        q.offer(20);
        q.add(30);
        System.out.println(q);
        q.poll();
        
        System.out.println(q);
        // we can do this q.remove(30); as LinkedList implements Queue
        // we can do this q.remove(); as LinkedList implements queue
        
    }
}
