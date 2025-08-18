// User function Template for Java
class Solution {
    int minCost(int[] height) {
        // code here
        int dp[] = new int[height.length];
        Arrays.fill(dp,-1);
        return help(height,height.length-1,dp);
    }
    
    private int help(int[] arr,int ind,int[] dp)
    {
        if(ind==0) return 0;
        if(dp[ind]!=-1) return dp[ind];
        int left = help(arr,ind-1,dp) + Math.abs(arr[ind]-arr[ind-1]);
        int right = Integer.MAX_VALUE;
        if(ind>1)
        {
            right = help(arr,ind-2,dp) + Math.abs(arr[ind]-arr[ind-2]);
        }
        dp[ind] = Math.min(left,right);
        return dp[ind];
    }
}