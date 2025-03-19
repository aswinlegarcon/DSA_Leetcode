class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> arr = new HashSet<>();
        for(int i=0;i<n-1;i++)
        {
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k)
            {
                if(nums[i] + nums[j] + nums[k] == 0)
                {
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                    result.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(k>j && nums[k] == nums[k+1]) k--;
                }
                else if(nums[i] + nums[j] + nums[k] > 0)
                {
                    k--;
                }
                else if(nums[i] + nums[j] + nums[k] < 0)
                {
                    j++;
                }
            }
        }
        return result;
    }
}