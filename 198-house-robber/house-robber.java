class Solution {
    public int rob(int[] nums) {

        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,nums.length-1,dp);

    }

    private int helper(int[] arr,int ind,int[] dp)
    {

        if(ind==0) return arr[0];
        if(ind<0) return 0;
        if(dp[ind]!=-1) return dp[ind];
        int pick = arr[ind] + helper(arr,ind-2,dp);
        int notPick = 0 + helper(arr,ind-1,dp);
        dp[ind] = Math.max(pick,notPick);
        return Math.max(pick,notPick);
        
    }
}