class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal) - helper(nums,goal-1); // basic maths of (sum <= k) - (sum <= k-1) === (sum == k)
    }

    public int helper(int[] nums,int goal)
    {
        if(goal<0) return 0;
        int l = 0;
        int r = 0;
        int sum = 0;
        int count = 0;
        while(r<nums.length) // to calculate sum <= goal
        {
            sum += nums[r];
            while(sum > goal && l<nums.length)
            {
                sum -= nums[l];
                l++;
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }
}