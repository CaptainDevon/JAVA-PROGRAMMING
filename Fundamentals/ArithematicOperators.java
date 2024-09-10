public class ArithematicOperators {

    public static void main(String[] args) {
        //basic operators
        /*
         Add: +
         Subtract: -
         Multiply: *
         Divide: /
         Remainder: %
         */

        /*Prefix and postfix operators 
         * Increment: ++
         * Decrement: --
         * prefix: variable++
         * postfix: ++variable
        */

        int val=5;
        System.out.println(val++);
        System.out.println(val);
        System.out.println(++val);

        /*Compound Assignment Operators
         * Add: +=
         * Substract: -=
         * Multiply: *=
         * Divide: /=
         */
        int val2=5;
        val2 *=10;
        System.out.println(val2);
    }
    
}
