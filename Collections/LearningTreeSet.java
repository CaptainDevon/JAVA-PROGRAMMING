import java.util.*;

public class LearningTreeSet {
    public static void main(String[] args) {
        //tree set will have unique elemets in sorted order
        TreeSet<Integer> tset=new TreeSet<>();
        tset.add(2);
        tset.add(4);
        tset.add(1);
        tset.add(5);
        tset.add(3);
        tset.add(1);
        tset.add(2);
        System.out.println(tset);
    }
}
