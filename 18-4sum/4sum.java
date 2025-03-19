class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> arr = new HashSet<>();
        int n= nums.length;
        for(int a=0;a<n;a++)
        {
            for(int b=a+1;b<n;b++)
            {
                HashSet<Long> checkD = new HashSet<>();
                for(int c = b+1;c<n;c++)
                {
                    long sum = nums[a];
                    sum += nums[b];
                    sum += nums[c];
                    long d = target - sum;
                    if(checkD.contains(d))
                    {
                        List<Integer> temp = new ArrayList<>(Arrays.asList(nums[a],nums[b],nums[c],(int)d));
                        Collections.sort(temp);
                        arr.add(temp);
                    }
                    checkD.add((long)nums[c]);
                }
            }
        }

        for(var lis:arr)
        {
            result.add(lis);
        }
        return result;
    }
}