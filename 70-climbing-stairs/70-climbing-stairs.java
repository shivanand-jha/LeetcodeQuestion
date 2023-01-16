class Solution {
    public int climbStairs(int n) {
    int dp[] = new int[n+1];
        if(n==1 || n==2)
        {
            return n;
        }
        if(n<1)
        {
            return 0;
        }
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<n+1; i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

    }
}