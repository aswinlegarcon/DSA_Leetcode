class Solution {

    public int lowerBound(int arr[],int x)
    {
        int n = arr.length;
        int right = n-1;
        int left = 0;
        int lb = n;
        while(left<=right)
        {
            int mid = (left+right) /2;
            if(arr[mid] >= x)
            {
                lb = mid;
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        return lb;
    }

    public int upperBound(int arr[],int x)
    {
        int n = arr.length;
        int right = n-1;
        int left = 0;
        int ub = n;
        while(left<=right)
        {
            int mid = (left+right) /2;
            if(arr[mid] > x)
            {
                ub = mid;
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        return ub;
    }
        
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int n = nums.length;
        int result[] = new int[2]; 
        int lb = lowerBound(nums,target);
        if(lb==n || nums[lb] != target) 
        {
            result[0] = -1;
            result[1] = -1;
        }
        else
        {
            result[0] = lb;
            result[1] = upperBound(nums,target)-1;
        }
        return result;
    }
}