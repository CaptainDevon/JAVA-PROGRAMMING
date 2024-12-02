import java.util.*;

public class Iterator5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        Iterator<String> itr = list.iterator();

        itr.forEachRemaining(item -> System.out.println("Processing: " + item));
    }
}
