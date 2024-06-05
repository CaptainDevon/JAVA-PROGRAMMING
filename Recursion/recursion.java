public class recursion {
    static void printname(int n)
    {
        if(n==0)return;
        System.out.println("divyansh");
        printname(n-1);

    }
    
    public static void main(String args[])
    {
        printname(5);
    }
}
