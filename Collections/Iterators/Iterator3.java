import java.util.*;

public class Iterator3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        ListIterator<String> listItr = list.listIterator();

        System.out.println("Forward traversal:");
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }

        System.out.println("Backward traversal:");
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }
    }
}
