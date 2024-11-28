import java.util.*;

public class PrintingSubsequenceOfString {
    public static void main(String args[]) {
        String s = "abc";
        HashSet<String> set = new HashSet<>();
        subSequence(s, 0, "", set);
    }

    public static void subSequence(String s, int index, String newString, HashSet<String> set) {
        if (index == s.length()) {
            if (set.contains((newString))) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = s.charAt(index);
        subSequence(s, index + 1, newString + currChar, set);
        subSequence(s, index + 1, newString, set);
    }
}
