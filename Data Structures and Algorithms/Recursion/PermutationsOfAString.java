public class PermutationsOfAString {
    public static void main(String[] args) {
        String s="abc";

        permute(s, "");
    }

    public static void permute(String s,String permutation)
    {
        if(s.length()==0)
            {
               System.out.println(permutation);
               return; 
            }
        for(int i=0;i<s.length();i++)
        {
            char currChar=s.charAt(i);
            String temp=s.substring(0, i)+s.substring(i+1);
            permute(temp, permutation+currChar);
        }
    }
}
