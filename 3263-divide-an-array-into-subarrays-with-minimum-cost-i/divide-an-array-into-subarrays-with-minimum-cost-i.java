class Solution {
    public int minimumCost(int[] nums) {
        int min1 = nums[0];
        int min1Ind = 0;
        int min2 = 100;
        int min2Ind = -1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<min2)
            {
                min2 = nums[i];
                min2Ind = i;
            }
        }
        int min3 = 100;
        for(int i=1;i<nums.length;i++)
        {
            if(i!=min2Ind && nums[i]<min3)
            {
                min3 = nums[i];
            }
        }
        return min1+min2+min3;

    }
}