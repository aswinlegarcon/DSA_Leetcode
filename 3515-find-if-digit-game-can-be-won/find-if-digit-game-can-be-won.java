class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumSingle = 0;
        int sumDouble = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>9)
            {
                sumDouble += nums[i];
            }
            else
            {
                sumSingle += nums[i];
            }
        }
        if(sumDouble==sumSingle) return false;
        return true;
    }
}