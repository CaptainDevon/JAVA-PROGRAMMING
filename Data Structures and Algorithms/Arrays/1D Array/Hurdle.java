import java.util.*;
public class Hurdle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        List<Integer> height=new ArrayList<>();
        while(n-->0)
        {
            height.add(s.nextInt());
        }

        System.out.println(hurdleRace(k, height));
        s.close();
    }

    public static int hurdleRace(int k,List<Integer> height)
    {
        int count=0;
        for(int i=0;i<height.size();i++)
        {
            if(height.get(i)>k && height.get(i)-k>count) count=height.get(i)-k;
        }
        return count;
    }
}
