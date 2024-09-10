public class ConditionalLogic {

    public static void main(String[] args) {
        /*
         * Relationsl Operators
         * Greater than: >
         * Greter than or equal to: >=
         * Less than: <
         * Less than or equal to: <=
         * Equal to: ==
         * Not equal to: !=
         */

        /*
         * Conditional Assignment
         * result= condition ? true_value : false-value;
         */

        int v1 = 5;
        int v2 = 6;
        int bigValue = v1 > v2 ? v1 : v2;
        System.out.println(bigValue);

        /*
         * Use of if-else
         * if(condition)
         * statement 1
         * else if(condition)
         * statement 2
         * else
         * default statement
         */
        if (v1 > v2) {
            System.out.println(v1);
        } else if (v1 < v2) {
            System.out.println(v2);
        } else if (v1 == v2) {
            System.out.println("Both the values are same");
        }

        System.out.println("-------------------------------------------------------");

        /*
         * Logical Operator
         * And: &
         * Or: |
         * XOR: ^
         * Negation: !
         */

        boolean done = false;
        if (!done)
            System.out.println("Keep Going!");

        /*
         * Conditional Logical operators
         * And: &&
         * Or: ||
         */

        char ch = 'r';

        if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
            System.out.println("Consonent");
        else
            System.out.println("Vowel");

    }
}
