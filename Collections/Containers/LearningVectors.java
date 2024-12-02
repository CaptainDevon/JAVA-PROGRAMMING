import java.util.*;

public class LearningVectors {
    public static void main(String[] args) {
        //used for synchronization
        //it is thread safe
        Vector<String> vector = new Vector<>();
        vector.add("5");
        vector.add("10");
        vector.add("15");
        vector.add("20");
        System.out.println(vector);
        vector.clear();
        System.out.println(vector);       
    }
}
