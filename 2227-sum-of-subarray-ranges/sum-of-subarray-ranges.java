class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long total = 0L;
        for(int i=0;i<n;i++)
        {
            long small = nums[i];
            long large = nums[i];
            for(int j=i;j<n;j++)
            {
                small = Math.min(small,nums[j]);
                large = Math.max(large,nums[j]);
                total += (large-small);
            }
            
        }
        return total;
    }
}