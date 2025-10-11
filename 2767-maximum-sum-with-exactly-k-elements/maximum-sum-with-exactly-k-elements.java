class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        int n = nums.length;
        for(int i=0;i<=n/2;i++)
        {
            max = Math.max(nums[i],max);
            max = Math.max(nums[n-i-1],max);
        }
        int score = max;
        for(int i=1;i<k;i++)
        {
            score += ++max;
        }
    return score;
    }
}