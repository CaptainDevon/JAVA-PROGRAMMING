public class Looping {
    public static void main(String[] args) {
        /*
         * Looping Types
         * for loop
         * while loop
         * do while loop
         * for each loop
         */

        // while loop
        int v1 = 4;
        int fact = 1;
        while (v1 > 1) {
            fact *= v1;
            v1--;
        }
        System.out.println(fact);

        // do while loop
        int v2=5;
        int sum=0;
        do{
            sum+=v2;
            v2--;
        } while(v2 > 0);
        System.out.println(sum);

        // for loop
        int sum2=0;
        for(int i=0;i<=5;i++)
        {
            sum2+=i;
        }
        System.out.println(sum2);
    }
}
