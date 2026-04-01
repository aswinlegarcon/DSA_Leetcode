class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] rowMax = new int[n];
        int[] colMax = new int[n];
        
        // Compute row and column maximums
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                rowMax[r] = Math.max(rowMax[r], grid[r][c]);
                colMax[c] = Math.max(colMax[c], grid[r][c]);
            }
        }
        
        int inc = 0;
        
        // Calculate total increase
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int maxx = Math.min(rowMax[r], colMax[c]);
                inc += maxx - grid[r][c];
            }
        }
        
        return inc;
    }
}