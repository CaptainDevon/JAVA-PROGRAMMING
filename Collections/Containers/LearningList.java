import java.util.*;

public class LearningList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2, 25);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.size());
    }
}
