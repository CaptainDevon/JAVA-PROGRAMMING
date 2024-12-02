import java.util.*;
class CustomCollection implements Iterable<Integer> {
    private List<Integer> numbers = Arrays.asList(10, 20, 30);

    @Override
    public Iterator<Integer> iterator() {
        return numbers.iterator();
    }
}

public class Iterator4 {
    public static void main(String[] args) {
        CustomCollection collection = new CustomCollection();

        for (int num : collection) { // Uses the iterator internally
            System.out.println(num);
        }
    }
}
