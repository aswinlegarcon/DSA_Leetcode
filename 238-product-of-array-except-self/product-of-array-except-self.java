class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int temp[] = new int[n];

        int suffix[] = new int[n];
        int prefix[] = new int[n];
        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        for(int i=1;i<n;i++)
        {
            prefix[i] = nums[i]*prefix[i-1];
        } 
        for(int i=n-2;i>=0;i--)
        {
            suffix[i] = nums[i]*suffix[i+1];
        } 

        for(int i=0;i<n;i++)
        {
            int pre = i!=0?prefix[i-1]:1;
            int suff = i!=n-1?suffix[i+1]:1;
            temp[i] = pre*suff;
        }
        return temp;
    }
}