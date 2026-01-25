class Solution {
    public int minInsertions(String s) {
        return s.length() - longestPalindromeSubseq(s);
    }

    private int longestPalindromeSubseq(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        int n = s.length();
        int m = s2.length();
        int dp[][] = new int[n][m];
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        return helper(n-1,m-1,s,s2,dp);
    }

    private int helper(int i,int j, String s, String s2, int[][] dp)
    {
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        if(s.charAt(i)==s2.charAt(j)) 
        return dp[i][j] = 1 + helper(i-1,j-1,s,s2,dp);
        dp[i][j] = 0 + Math.max(helper(i-1,j,s,s2,dp),helper(i,j-1,s,s2,dp));
        return dp[i][j];
    }
}