class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int cnt = 0;
        int n =nums.length;
        int ind = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                ind = i+1;
                break;
            }
        }
        for(int i=ind;i<n;i++)
        {
            if(nums[i]==0) cnt++;
            else
            {
                if(cnt<k) return false; 
                cnt = 0;
            }
        }
        return true;
    }
}