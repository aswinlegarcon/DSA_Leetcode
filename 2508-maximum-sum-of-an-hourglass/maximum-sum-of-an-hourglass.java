class Solution {
    public int maxSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int max = 0;

        for(int i=0;i<n-2;i++)
        {
            for(int j=0;j<m-2;j++)
            {
                int top = grid[i][j] + grid[i][j+1] + grid[i][j+2];
                int mid = grid[i+1][j+1];
                int last = grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];
                int sum = top + mid + last;
                max = Math.max(max,sum);
            }
        }
        return max;
        
    }
}