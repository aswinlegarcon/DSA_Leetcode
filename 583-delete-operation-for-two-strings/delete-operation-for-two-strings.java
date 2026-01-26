class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n][m];
        for(int[] arr:dp)
        {
            Arrays.fill(arr,-1);
        }
        int len = getLCS(n-1,m-1,word1,word2,dp);
        return n-len + m-len;
    }

    private int getLCS(int i,int j,String word1, String word2,int dp[][])
    {
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        if(word1.charAt(i) == word2.charAt(j))
        return dp[i][j] = 1 + getLCS(i-1,j-1,word1,word2,dp);

        dp[i][j] = Math.max(
            getLCS(i-1,j,word1,word2,dp), getLCS(i,j-1,word1,word2,dp));
        return dp[i][j];
    }
}