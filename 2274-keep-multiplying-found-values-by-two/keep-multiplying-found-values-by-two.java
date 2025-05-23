class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(ls(nums,original))
        {
            original = original * 2;
        }
        return original;
    }

    private boolean ls(int[] nums,int original)
    {
        int l = 0;
        int r = nums.length-1;
        while(l<=r)
        {
            if(nums[l]==original) return true;
            else if(nums[r]==original) return true;
            l++;
            r--;
        }
        return false;
    }
}