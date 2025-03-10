import java.util.*;
public class SubarrayDivision {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        List<Integer>s=new ArrayList<>();
        int n=scan.nextInt();
        while(n-->0)
        {
            s.add(scan.nextInt());
        }
        int d=scan.nextInt();
        int m=scan.nextInt();
        System.out.println(birthday(s,d,m));
        scan.close();
    }

    public static int birthday(List<Integer> s, int d, int m) {
            int count=0;
            int l=0,r=m-1;
            if(m==0) return 0;
            while(r<s.size())
            {
                if(sumCalculator(s,l,r,d))count++;
                l++;
                r++;
            }
            return count;
        }

    public static boolean sumCalculator(List<Integer>s,int l,int r,int d)
    {
        int sum=0;
        for(int i=l;i<=r;i++)
        {
            sum+=s.get(i);
        }
        if(sum==d) return true;
        return false;
    }

}
