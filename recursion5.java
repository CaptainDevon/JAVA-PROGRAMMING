public class recursion5 {

    static int power(int n,int x)
    {
        if(x==1) return n*1;
        else return n*power(n,x-1);
    }
    public static void main(String args[])
    {
        System.out.println(power(6,3));
    }
}
