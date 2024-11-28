public class PrintingSubsequenceOfString {
    public static void main(String args[])
    {
        String s="abc";
        subSequence(s, 0, "");
    }

    public static void subSequence(String s,int index,String newString)
    {
        if(index==s.length())
        {
            System.out.println(newString);
            return;
        }
        char currChar=s.charAt(index);
        subSequence(s, index+1, newString+currChar);
        subSequence(s, index+1, newString);
    }
}
