class Solution {
        
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int n = nums.length;
        int result[] = new int[2]; 
        int left = 0;
        int right = n-1;

        while(left<=right)
        {
            int mid = (left+right) / 2;
            if(nums[mid] == target)
            {
                first = mid;
                right = mid-1;
            }
            else if(nums[mid] > target)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        left = 0;
        right = n-1;
        
        while(left<=right)
        {
            int mid = (left+right) / 2;
            if(nums[mid] == target)
            {
                last = mid;
                left = mid+1;
            }
            else if(nums[mid] > target)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        result[0] = first;
        result[1] = last;
        return result;
    }
}