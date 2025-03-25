class Solution {
    public int search(int[] nums, int target) 
    {
        
       return helpSearch(nums,target,0,nums.length-1);
    }

    public int helpSearch(int nums[],int target,int low,int high)
    {
        int mid = (low+high) / 2;
        if(low>high)
        {
            return -1;   
        }
        if(nums[mid]==target) return mid;
        else if(nums[mid] < target)
        {
            return helpSearch(nums,target,mid+1,high);
        }
        else
        {
            return helpSearch(nums,target,low,mid-1);
        }
        
    }
}