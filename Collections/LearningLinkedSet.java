import java.util.*;
public class LearningLinkedSet {
    public static void main(String[] args) {
        //keeps the value in ordered
        LinkedHashSet<Integer> llset=new LinkedHashSet<>();
        llset.add(20);
        llset.add(10);
        llset.add(2);
        llset.add(11);
        llset.add(2);
        System.out.println(llset);
    }
}
