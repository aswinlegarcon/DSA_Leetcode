class Solution {
    public int findMaxK(int[] nums) {
        int[] hash = new int[1001];
        int ans = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > 0) hash[nums[i]]++;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                if(hash[Math.abs(nums[i])] > 0) ans = Math.max(ans,Math.abs(nums[i]));
            }
        }   
        return ans;
    }
}