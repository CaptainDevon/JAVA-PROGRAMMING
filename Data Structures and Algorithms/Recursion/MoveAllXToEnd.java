public class MoveAllXToEnd {
    public static void main(String args[]) {
        String str = "abxbcxxd";
        String newString = "";
        movingAllXToEnd(str, 0, 0, newString);
    }

    public static void movingAllXToEnd(String s, int index,int count,String newString) 
    {
        if(index==s.length())
        {
            while(count-->0)
            {
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currChar=s.charAt(index);
        if(currChar=='x')
        {
            count++;
            movingAllXToEnd(s, index+1, count, newString);
        }
        else
        {
            newString+=currChar;
            movingAllXToEnd(s, index+1, count, newString);

        }

    }
}
