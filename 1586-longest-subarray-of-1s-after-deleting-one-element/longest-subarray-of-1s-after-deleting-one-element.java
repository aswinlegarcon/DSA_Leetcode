class Solution {
    public int longestSubarray(int[] nums) {
        
        int maxLen = 0;
        int cntZ = 0;
        int l = 0;
        int r = 0;
        int n = nums.length;
        int cnt = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                cnt++;
            }
        }
        if(cnt==n) return cnt-1;

        while(r<n)
        {
            if(nums[r]==0)
            {
                cntZ++;
            } 
            while(cntZ>1)
            {
                if(nums[l]==0) cntZ--;
                l++;
            }
            maxLen = Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen-1;
    }
}