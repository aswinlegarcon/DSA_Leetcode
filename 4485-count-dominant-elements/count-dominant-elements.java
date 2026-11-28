class Solution {
    public int countDominantElements(int[] nums) {
        int n = nums.length;
        int ans = 0;
        if(n==1) return 1;
        for(int i=0;i<n;i++)
        {
            if(i==0 && i+1<n){
                if(nums[i] >= nums[i+1]) ans++;
            }
            else if(i==n-1 && i-1>-1){
                if(nums[i] >= nums[i-1]) ans++;
            }
            else{
                double avg = ((double)nums[i-1] + (double)nums[i+1])/2;
                if(nums[i] >= avg) ans++;
            }

        }
        return ans;
    }
}