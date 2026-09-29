class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int prodMax = nums[n-1] * nums[n-2];
        int prodMin = nums[0] * nums[1];
        return prodMax - prodMin; 
    }
}