class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        HashSet<List<Integer>> arrays = new HashSet<>();
        for(int i=0;i<n-1;i++)
        {
            HashSet<Integer> hash = new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int k = -(nums[i] + nums[j]);
                if(hash.contains(k))
                {
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i],nums[j],k));
                    Collections.sort(temp);
                    arrays.add(temp);
                }
                hash.add(nums[j]);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for(List<Integer> lis: arrays)
        {
            result.add(lis);
        }
        return result;
    }
}