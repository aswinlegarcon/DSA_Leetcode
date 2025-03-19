class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n= nums.length;
        for(int a=0;a<n;a++)
        {
            if(a>0 && nums[a] == nums[a-1]) continue;
            for(int b=a+1;b<n;b++)
            {
                if(b>a+1 && nums[b] == nums[b-1]) continue;
                int c = b+1;
                int d = n-1;
                while(c<d)
                {
                    long sum = nums[a]; // should not add in single line so that it can exceed int
                    sum += nums[b];
                    sum += nums[c];
                    sum += nums[d];
                    if(sum == target)
                    {
                        List<Integer> temp = new ArrayList<>(Arrays.asList(nums[a],nums[b],nums[c],nums[d]));
                        result.add(temp);
                        c++;
                        d--;
                        while(c<d && nums[c] == nums[c-1]) c++;
                        while(d>c && nums[d] == nums[d+1]) d--;

                    }
                    else if(sum > target)
                    {
                        d--;
                    }
                    else
                    {
                        c++;
                    }
                }
            }
        }
        return result;
    }
}