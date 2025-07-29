class Solution {

    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = new int[2];
        int max = Integer.MIN_VALUE;
        int index = 0;
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<n;i++)
        {
            int cnt = 0;
            for(int j=0;j<m;j++)
            {
                cnt += mat[i][j];
            }
            if(cnt>max)
            {
                max = cnt;
                index = i;
            }
        }
        ans[0] = index;
        ans[1] = max;
        return ans;
    }
}