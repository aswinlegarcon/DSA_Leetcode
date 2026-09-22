class Solution {
    public int countSubarrays(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for(int i=0;i<n-2;i++)
        {
            int sum = 2 * (nums[i] + nums[i+2]);
            if(nums[i+1] == sum ){
                cnt++;
            }
        }
        return cnt;
    }
}