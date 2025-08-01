class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int ans[] = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(Math.abs(i-j) >= indexDifference && Math.abs(nums[i]-nums[j]) >= valueDifference)
                {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}