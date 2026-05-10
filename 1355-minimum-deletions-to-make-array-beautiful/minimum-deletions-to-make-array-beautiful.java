class Solution {
    public int minDeletion(int[] nums) {
        int n = nums.length;
        if(n==1) return 1;
        int cnt = 0;
        for(int i=0;i<n-1;i++)
        {
            if((i-cnt)%2 == 0 && nums[i] == nums[i+1])
            {
                cnt++;
            }
        }

        if((nums.length - cnt) % 2 != 0) cnt++;
        return cnt;
    }
}