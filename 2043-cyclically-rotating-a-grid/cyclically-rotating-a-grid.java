class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] res = new int[n][m];

        int layers = Math.min(n,m) / 2;
        for(int layer=0;layer<layers;layer++)
        {
            List<Integer> arr = new ArrayList<>();
            int left = layer;
            int right = m - layer - 1;
            int top = layer;
            int bottom = n - layer - 1;

            for(int i=left;i<=right;i++)
            {
                arr.add(grid[top][i]);
            }
            for(int i=top+1;i<=bottom-1;i++)
            {
                arr.add(grid[i][right]);
            }
            
            for(int i=right;i>=left;i--)
            {
                arr.add(grid[bottom][i]);
            }
        
            for(int i=bottom-1;i>=top+1;i--)
            {
                arr.add(grid[i][left]);
            }
           

            List<Integer> rotated = new ArrayList<>();
            int len = arr.size();
            int rot = k % len;
            for(int i=0;i<len;i++)
            {
                rotated.add(arr.get((i+rot)%len));
            }

            int ind = 0;
            for(int i=left;i<=right;i++)
            {
                res[top][i] = rotated.get(ind++);
            }
            for(int i=top+1;i<=bottom-1;i++)
            {
                res[i][right] = rotated.get(ind++);
            }
            
            for(int i=right;i>=left;i--)
            {
                res[bottom][i] = rotated.get(ind++);

            }
            for(int i=bottom-1;i>=top+1;i--)
            {
                res[i][left] = rotated.get(ind++);
            }
            
        }

        return res;
    }
}