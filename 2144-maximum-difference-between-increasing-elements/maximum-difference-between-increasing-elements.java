class Solution {
    public int maximumDifference(int[] nums) {
        int max = -1;
        int minVal = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>minVal)
            {
                max = Math.max(max,nums[i]-minVal);
            }
            minVal = Math.min(minVal,nums[i]);
            
        }
        return max;
    }
}