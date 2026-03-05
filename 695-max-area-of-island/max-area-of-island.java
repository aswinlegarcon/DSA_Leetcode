class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean visited[][] = new boolean[n][m];

        int max = 0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1 && !visited[i][j])
                {
                    max = Math.max(helper(grid,i,j,visited,n,m),max);
                }
            }
        }
        return max;
    }

    private int helper(int[][] grid, int i, int j,boolean visited[][],int n, int m)
    {
        if(i < 0 || i >= n || j < 0 || j >= m || visited[i][j] || grid[i][j]==0) return 0;

        visited[i][j] = true;

        return 1 + helper(grid, i+1, j, visited,n,m) + helper(grid, i-1, j, visited,n,m) 
        + helper(grid, i, j+1, visited,n,m) + helper(grid, i, j-1, visited,n,m);
    }
}