class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            int diff = Math.abs(nums[i]-nums[(i+1)%nums.length]);
            max = Math.max(max,diff);
        }

        return max;
    }
}