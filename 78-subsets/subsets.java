class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int subsets = 1<<nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<subsets;i++) // 0-n-1
        {
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<nums.length;j++) // to check ith bit is set or not
            {
                if((i & (1<<j)) != 0) // ith bit set the add that
                {
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}