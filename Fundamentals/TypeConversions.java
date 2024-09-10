public class TypeConversions {
    
    public static void main(String[] args) {
        /*Implicit conversion */
        int integerValue1=50;
        long longValue1= integerValue1;

        /*Explicit Conversions */
        long longValue2=150;
        int integerValue2=(int) longValue2;

        System.out.println(integerValue1);
        System.out.println(longValue1);
        System.out.println(integerValue2);
        System.out.println(longValue2);
    }
}
