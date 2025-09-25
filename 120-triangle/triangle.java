class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int min = 0;
        int n = triangle.size();
        int ind = 0;
        int dp[][] = new int[n][n];

        //coming from last
        for(int i=n-1;i>=0;i--)
        {
            dp[n-1][i] = triangle.get(n-1).get(i);
        }

        for(int i=n-2;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                int bottom = triangle.get(i).get(j) + dp[i+1][j+1];
                int bottom2 = triangle.get(i).get(j) + dp[i+1][j];

                dp[i][j] = Math.min(bottom,bottom2);
            }
        }
        return dp[0][0];
    }
}