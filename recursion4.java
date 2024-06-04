public class recursion4 {

    static int Fact(int n)
    {
        if(n==1)return 1;
        else return n*Fact(n-1);
    }
    public static void main(String args[])
    {
        System.out.println(Fact(5));
    }
    
}
