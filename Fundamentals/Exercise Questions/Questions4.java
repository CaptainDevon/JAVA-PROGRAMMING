import java.util.*;
public class Questions4 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        int radius=s.nextInt();
        circumferenceOfTheCircle(radius);
        s.close();
    }    

    public static void circumferenceOfTheCircle(int radius)
    {
        System.out.println("The circumference of the circle is= "+2*Math.PI*radius);
    }
}
