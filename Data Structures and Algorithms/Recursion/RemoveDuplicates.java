public class RemoveDuplicates {

    public static boolean[] map = new boolean[26];

    public static void main(String args[]) {
        String s = "abbccda";
        removingDuplicates(s, 0, "");

    }

    public static void removingDuplicates(String s, int index, String newString) {
        if (index == s.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = s.charAt(index);
        if (map[currChar - 'a'] == true) {
            removingDuplicates(s, index + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removingDuplicates(s, index + 1, newString);
        }
    }

}
