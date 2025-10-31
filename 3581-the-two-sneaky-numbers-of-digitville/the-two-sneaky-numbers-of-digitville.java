class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int n = nums.length;
        int[] hash = new int[n];
        for(int i=0;i<n;i++)
        {
            hash[nums[i]]++;
        }
        int ind = 0;
        for(int i=0;i<n;i++)
        {
            if(hash[i]==2) 
            {
                ans[ind] = i;
                ind++;
            }
        }
        return ans;
    }
}