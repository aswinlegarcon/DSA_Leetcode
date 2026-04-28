class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        if(m*n==1) return 0;
        int arr[] = new int[m*n];
        int ind = 0;
        int rem = grid[0][0]%x;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]%x != rem) return -1;
                arr[ind] = grid[i][j];
                ind++;
            }
        }

        Arrays.sort(arr);
        int mid = arr.length/2;
        int cnt = 0;
        for(int i=0;i<mid;i++)
        {
            cnt += Math.abs(arr[i]-arr[mid])/x;
        }

        for(int i=mid+1;i<arr.length;i++)
        {
            cnt += Math.abs(arr[i]-arr[mid])/x;
        }

        return cnt;
    }
}