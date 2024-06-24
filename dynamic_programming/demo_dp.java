package dynamic_programming;

public class demo_dp {

    static int dp_tabulation(int n,int[] dp)
    {   
        //iterative method
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    static int space_optimization_dp(int n)
    {
        //tabulation in efficient manner
        if(n<=1)return n;
        int ft=0;
        int st=1;
        int nt=0;
        for(int i=2;i<=n;i++)
        {
            nt=ft+st;
            ft=st;
            st=nt;
        }
        return  nt;
    }

    static int dp_memorization(int n,int[] dp)
    {
        //recursive method
        if(n<=1)return n;
        if(dp[n]!=0)return dp[n];
        dp[n]=dp_memorization(n-1,dp)+dp_memorization(n-2, dp);
        return dp[n];
    }
    static int fib(int n)
    {
        if(n==0)return 0;
        if(n==1)return 1;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
        int dp[]=new int[6];
        int dp1[]=new int[6];
        System.out.println(dp_memorization(5,dp));
        System.out.println(dp_tabulation(5,dp1));
        System.out.println(space_optimization_dp(5));
        
    }
}
