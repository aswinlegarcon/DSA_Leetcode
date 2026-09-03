class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        List<Integer> lst = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nums[j]==key && Math.abs(i-j) <= k) 
                {
                    lst.add(i);
                    break;
                }
            }
        }
        return lst;
    }
}