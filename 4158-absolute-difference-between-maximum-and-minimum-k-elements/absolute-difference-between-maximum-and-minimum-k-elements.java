class Solution {
    public int absDifference(int[] nums, int k) {
        int smallSum = 0;
        int largeSum = 0;
        Arrays.sort(nums);
        int n = nums.length;
        int indSmall = 0;
        int indLarge = n-1;
        for(int i=1;i<=k;i++)
        {
            smallSum += nums[indSmall];
            largeSum += nums[indLarge];
            indSmall++;
            indLarge--;
        }
        return Math.abs(smallSum - largeSum);
    }
}