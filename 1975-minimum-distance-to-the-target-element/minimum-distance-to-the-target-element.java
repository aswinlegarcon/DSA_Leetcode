class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;

        int rightMin = Integer.MAX_VALUE;
        int leftMin = Integer.MAX_VALUE;
        for(int i=start;i<n;i++)
        {
            if(nums[i]==target)
            {
                rightMin = Math.abs(start - i);
                break;
            }
        }

        for(int i=start-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
                leftMin = Math.abs(start - i);
                break;
            }
        }
        return Math.min(rightMin,leftMin);
    }
}