public class KeyPadCombination {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String[] args) {
        String str="23";
        printCombinations(str, 0, "");
    }

    public static void printCombinations(String s,int index,String combination)
    {
        if(index==s.length())
        {
            System.out.println(combination);
            return;
        }
        char currChar=s.charAt(index);
        String mapping=keypad[currChar-'0'];
        for(int i=0;i<mapping.length();i++)
        {
            printCombinations(s, index+1, combination+mapping.charAt(i));
        }
    }
}
