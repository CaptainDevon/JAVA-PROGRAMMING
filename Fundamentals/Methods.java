public class Methods {
    
    //methods is also called as function

    static void printName(String name)
    {
        System.out.println("hello my name is "+name);
    }

    static void showSum(int x, int y, int count)
    {
        int sum=x+y;
        for(int i=0;i<count;i++)
        {
            System.out.println(sum);
        }
    }

    static void swapping(int x,int y)
    {
        int temp=x;
        x=y;
        y=temp;
        System.out.println(x);
        System.err.println(y);
    }
    public static void main(String[] args) {
        String name="Divyansh Sinha";

        printName(name);
        showSum(3, 4, 2);
        swapping(4,6);
    }
}
