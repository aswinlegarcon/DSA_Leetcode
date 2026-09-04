class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] score = new int[n];
        for(int i=0;i<n;i++)
        {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int j=0;j<=i;j++)
            {
                max = Math.max(nums[j],max);
            }
            for(int j=i;j<n;j++)
            {
                min = Math.min(nums[j],min);
            }
            score[i] = max-min;
        }
        int ans = Integer.MAX_VALUE;
        int ansInd = -1;
        for(int i=0;i<n;i++)
        {
            if(score[i]<=k)
            {
                ansInd = i;
                break;
            }
        }
        return ansInd;
    }
}