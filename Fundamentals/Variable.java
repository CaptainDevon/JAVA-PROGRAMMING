public class Variable {
    public static void main(String[] args) {
        //method 1
        int myVar;
        myVar=50;
        //method 2
        int anotherVar=100;
        System.out.println(myVar+" "+anotherVar);
       
        //changing of the values of the variables
        myVar=anotherVar;
        System.out.println(myVar);
 
        //constant variable
        final int maxValues=25;
        // it will show the error maxValues=75;
        
        System.out.println(maxValues);
    }
}
