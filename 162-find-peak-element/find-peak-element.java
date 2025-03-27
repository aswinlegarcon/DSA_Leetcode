class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 1;
        int high = n-2;
        if(n==1)
        {
            return 0;
        }
        if(nums[0] > nums[1])
        {
            return 0;
        }
        if(nums[n-1] > nums[n-2])
        {
            return n-1;
        }

        while(low<=high)
        {
            int i = (low+high) / 2;
            if(nums[i-1] < nums[i] && nums[i] > nums[i+1])
            {
                return i;
            }
            else if(nums[i-1]< nums[i])
            {
                low = i+1;
            }
            else
            {
                high = i-1;
            }
        }
        return -1;
    }
}