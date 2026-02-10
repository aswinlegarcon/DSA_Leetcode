class Solution {
    public int longestBalanced(int[] nums) {
        int maxLen = 0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> odd = new HashSet<>();
            HashSet<Integer> even = new HashSet<>();

            for(int j=i;j<n;j++)
            {
                if(nums[j] % 2 == 0) even.add(nums[j]);
                else odd.add(nums[j]);

                if(odd.size() == even.size())
                {
                    maxLen = Math.max(j-i+1,maxLen);
                }
            }
            
        }
        return maxLen;
    }
}