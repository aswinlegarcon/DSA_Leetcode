class Solution {
    public int lowerBound(int[] nums,int target,int start,int end)
    {
        int low = start;
        int high = end-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(nums[mid] < target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return low;
    }

    public int upperBound(int[] nums,int target,int start,int end)
    {
        int low = start;
        int high = end-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(nums[mid] <= target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return low;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        long res = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i =0;i+1<n;i++)
        {
            int min = lower - nums[i];
            int max = upper - nums[i];

            int lb = lowerBound(nums,min,i+1,n);
            int ub = upperBound(nums,max,i+1,n);
            res = res + (ub-lb);
        }
        return res;
        
    }
}