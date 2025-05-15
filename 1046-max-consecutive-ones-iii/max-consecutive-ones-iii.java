class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int max = 0;
        int cnt0 = 0;
        int n = nums.length;
        while(r<n)
        {
            if(nums[r]== 0) cnt0++;
            if(k<cnt0)
            {
                if(nums[l] == 0) cnt0--;
                l++;
            }
            if(cnt0<=k)
            {
                max = Math.max(max,r-l+1);
            }
            
            r++;
        }
        return max;
    }
}