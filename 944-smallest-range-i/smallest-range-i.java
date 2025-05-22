class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        int temp = k; // for min
        for(int i=temp;i>=-temp;i--)
        {
            if(min+i<=max)
            {
                min = min+i;
                break;
            }
        }
        temp = k; // for max
        for(int i=-temp;i<=temp;i++)
        {
            if(max+i>=min)
            {
                max = max+i;
                break;
            }
        }

        return max-min;
    }
}