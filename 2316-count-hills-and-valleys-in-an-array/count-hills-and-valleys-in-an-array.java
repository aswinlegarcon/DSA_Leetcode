class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[j])
            {
                j++;
                nums[j] = nums[i];
            }
        }

        int cnt = 0;
        for(int i=1;i<j;i++)
        {
            int cur = nums[i];
            int left = nums[i-1];
            int right = nums[i+1];
            if(cur>left && cur>right || cur<left && cur<right) cnt++;
        }
        return cnt;
    }
}