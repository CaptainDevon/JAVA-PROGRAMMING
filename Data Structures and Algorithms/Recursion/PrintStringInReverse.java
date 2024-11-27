import java.util.*;

public class PrintStringInReverse {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = s.nextLine();
        System.out.print("Reversed word: ");
        reverseWord(word,word.length()-1);
        s.close();
    }

    public static void reverseWord(String word,int n) {
        if(n==0)
        {
            System.out.print(word.charAt(n));
            return;
        }
        System.out.print(word.charAt(n));
        reverseWord(word, n-1);
    }
}
