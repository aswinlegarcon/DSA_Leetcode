class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                dp[i][j] = -1;
            }
        }
        return helper(0,0,m,n,dp,grid);

    }

    private int helper(int i,int j,int m,int n,int dp[][],int grid[][])
    {
        if(i==m-1 && j==n-1) return grid[i][j];
        if(i==m || j==n) return 100000;
        if(dp[i][j]!=-1) return dp[i][j];
        int right = grid[i][j] + helper(i,j+1,m,n,dp,grid);
        int down = grid[i][j] + helper(i+1,j,m,n,dp,grid);
        dp[i][j] = Math.min(right,down);
        return dp[i][j];
    }
}