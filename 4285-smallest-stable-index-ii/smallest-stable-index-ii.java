class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        for(int i=1;i<n;i++)
        {
            prefix[i] = Math.max(nums[i],prefix[i-1]);
        }
        for(int i=n-2;i>=0;i--)
        {
            suffix[i] = Math.min(nums[i],suffix[i+1]);
        }
        int[] scores = new int[n];
        for(int i=0;i<n;i++)
        {
            scores[i] = prefix[i] - suffix[i];
            if(scores[i]<=k) return i;
        }
        return -1;
    }
}