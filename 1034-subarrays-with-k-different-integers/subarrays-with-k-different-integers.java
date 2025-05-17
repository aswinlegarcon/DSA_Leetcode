class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k) - helper(nums,k-1);
    }

    public int helper(int[] nums, int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int count = 0;
        while(r<nums.length)
        {
            if(map.containsKey(nums[r]))
            {
                map.put(nums[r],map.get(nums[r])+1);
            }
            else
            {
                map.put(nums[r],1);
            }

            while(map.size()>k)
            {
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0)
                {
                    map.remove(nums[l]);
                }
                l++;
            }
            count = count + (r-l+1);
            r++;
        }
        return count;
    }
}