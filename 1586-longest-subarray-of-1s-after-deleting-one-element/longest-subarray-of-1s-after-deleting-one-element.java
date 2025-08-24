class Solution {
    public int longestSubarray(int[] nums) {
        int maxLen = 0;
        int cntZ = 0;
        boolean check = false;
        int l = 0;
        int r = 0;
        int zInd = 0;
        int n = nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                 zInd = i;
                 break;
            }
        }
        while(r<n)
        {
            if(nums[r]==0)
            {
                cntZ++;
                check = true;
            } 
            if(cntZ>1)
            {
                l = zInd+1;
                zInd = r;
                cntZ--;
            }
            if(cntZ==0) maxLen = Math.max(maxLen,r-l+1);
            else maxLen = Math.max(maxLen,r-l);
            r++;
        }
        if(!check) maxLen -= 1;
        return maxLen;
    }
}