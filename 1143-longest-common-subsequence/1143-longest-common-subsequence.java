class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        char[] str1 = t1.toCharArray();
        char[] str2 = t2.toCharArray();
        int[][] dp = new int[t1.length()+1][t2.length()+1];
        for(int i=1; i<str1.length+1; i++)
        {
            for(int j=1; j<str2.length+1; j++)
            {
                if(str1[i-1]==str2[j-1])
                {
                    dp[i][j] = dp [i-1][j-1] +1; 
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[str1.length][str2.length];
    }
}