class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int n:nums)
        {
            sum += n;
        }
        if(sum%2==1) return false;
        int target = sum/2;
        int dp[][] = new int[nums.length][target+1];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return helper(nums.length-1,target,nums,dp);
        
    }

    private boolean helper(int i,int target, int nums[], int dp[][])
    {
        if(target==0) return true;
        if(i==0) return target==nums[0];
        if(dp[i][target] != -1) return dp[i][target]==1;
        boolean notTake = helper(i-1,target,nums,dp);
        boolean take = false;
        if(target>=nums[i]) take = helper(i-1,target-nums[i],nums,dp);
        dp[i][target] = (notTake || take) ? 1 : 0;
        return dp[i][target]==1?true:false;
    }
}