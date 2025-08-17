class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int[] temp = new int[n-1];
        int temp2[] = new int[n-1];
        int ind1 = 0;
        int ind2 = 0;
        for(int i=0;i<n;i++)
        {
            if(i!=0) 
            {
                temp[ind1] = nums[i];
                ind1++;
            }
            if(i!=n-1)
            {
                temp2[ind2] = nums[i];
                ind2++;
            }
        }
        int first = helper(temp2,n-2,dp);
        Arrays.fill(dp,-1);
        int second = helper(temp,n-2,dp);
        return Math.max(second,first);
    }

    private int helper(int[] nums,int ind,int[] dp)
    {
        if(ind==0) return nums[0];
        if(ind<0) return 0;
        if(dp[ind]!=-1) return dp[ind];

        int pick = nums[ind] + helper(nums,ind-2,dp);
        int notPick = 0 + helper(nums,ind-1,dp);
        dp[ind] = Math.max(pick,notPick);
        return Math.max(pick,notPick);
    }

    
}