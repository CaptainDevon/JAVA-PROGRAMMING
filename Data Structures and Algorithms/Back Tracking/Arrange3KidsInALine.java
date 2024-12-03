import java.util.*;

public class Arrange3KidsInALine {

    public static void main(String args[]) {
        String str = "ABC";
        printPermutations(str, "", 0);
    }

    public static void printPermutations(String s, String perm, int ind) {
        if(s.length()==0)
        {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            String  newString = s.substring(0, i) + s.substring(i + 1);
            printPermutations(newString, perm+currChar, ind+1);
        }
    }
}
