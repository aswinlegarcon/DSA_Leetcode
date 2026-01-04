class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m][n];
        int min = Integer.MAX_VALUE;
        for(int[] row:dp)
        {
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        for(int i=0;i<n;i++)
        {
            min = Math.min(min, helper(0,i,m,n,matrix,dp));
        }
        return min;
    }

    private int helper(int i,int j, int m,int n, int[][] mat,int dp[][])
    {
        if(j<0 || j==n) return 10000;
        if(i==m-1) return mat[i][j];
        if(dp[i][j] != Integer.MAX_VALUE) return dp[i][j];
        int down = mat[i][j] + helper(i+1,j,m,n,mat,dp);
        int ldown = mat[i][j] + helper(i+1,j-1,m,n,mat,dp);
        int rdown = mat[i][j] + helper(i+1,j+1,m,n,mat,dp);
        dp[i][j] = Math.min(down, Math.min(ldown,rdown));
        return dp[i][j];
    }
}