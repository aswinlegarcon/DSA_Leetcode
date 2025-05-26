class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length==1 || nums.length==2) return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minInd = -1;
        int maxInd = -1;
        int l = 0;
        int r = nums.length-1;
        while(l<=r)
        {
            if(nums[l]>max) 
            {
                max = nums[l];
                maxInd = l;
            }
            if(nums[l]<min) 
            {
                min = nums[l];
                minInd = l;
            }
            if(nums[r]>max) 
            {
                max = nums[r];
                maxInd = r;
            }
            if(nums[r]<min) 
            {
                min = nums[r];
                minInd = r;
            }
            l++;
            r--;
        }
        int ind = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(i==minInd || i==maxInd) continue;
            ind = i;
            break;
        }
        return nums[ind];
        

    }
}