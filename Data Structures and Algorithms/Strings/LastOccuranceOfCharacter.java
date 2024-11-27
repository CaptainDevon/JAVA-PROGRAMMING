import java.util.*;

public class LastOccuranceOfCharacter {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String str = s.nextLine();
        System.out.print("WHich character u wanna find? ");
        char character = s.nextLine().charAt(0);
        System.out.println("The last occurance of the character is at: " + lastOccuranceOfCharacter(str, character));
        s.close();
    }

    public static int lastOccuranceOfCharacter(String s, char c) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                result = i;
            }
        }

        return result;
    }
}
