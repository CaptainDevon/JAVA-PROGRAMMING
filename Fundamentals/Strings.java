

public class Strings {

    static int valueFromWord(String word) {
        String[] numberWords = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        int value=0;
        for(int i=0;i<numberWords.length;i++)
        {
            if(word.equals(numberWords[i]))
            {
                value=i;
                break;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        String firstName = "Divyansh";
        String lastName = "Sinha";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        fullName += " I Love";
        fullName += " Java";
        System.out.println(fullName);

        // string equality
        String s1 = "I love";
        s1 += " Java";
        String s2 = "I";
        s2 += " love Java";
        if (s1 == s2)
            System.out.println("they are equal strings");
        else
            System.out.println("they are not the equal strings");

        if (s1.equals(s2))
            System.out.println("the strings values are same");
        else
            System.out.println("The strings values are not same");

        // we can also do
        String s3 = s1.intern();
        String s4 = s2.intern();
        if (s3 == s4)
            System.out.println("They are equal");
        else
            System.out.println("They are not Equal");

        /*
         * String class method
         * length = returns the length of the string
         * concat = jois two strings
         * replace = replace the value of the string
         * toLowerCase = converts all the charecters into lowercase
         * toUpperCase = converts all the charecters into capital letters
         * trim = removing some charecters from the string
         * split = breaking the string into pieces
         * charAt = takes charecter from the string
         * substring = takes substring from the string
         * contains = substring present in the main string
         * endsWith = checks whether the main string ends with the given substring
         * startsWith = checks whether the main string starts with the given substring
         * indexOf = starting index of the substring in the string
         * lastindexOf = ending index of the substring in the string
         * equals = checks if two strings are equal
         * equalsignoreCase = checks if two strings are equal by making the comparable
         * strings into lowercase
         * isEmpty = checks if the str.length is 0
         * compareTo = comparing of the strings
         * compareToignoreCase = comparing of the strings ignoring the case of the
         * charecters
         * format = formats the string
         * valueOf = converting non string types into string
         */

        int iVal = 100;
        String sVal = String.valueOf(iVal);
        System.out.println(sVal);

        String word="two";
        System.out.println(valueFromWord(word));

    }
    
}
