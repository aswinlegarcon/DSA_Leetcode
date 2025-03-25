class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int maxBeforeTarget = Integer.MIN_VALUE;
        int minAfterTarget = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int j = i+1;
            int k = nums.length-1;
            while(j<k)
            {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > target)
                {
                    minAfterTarget = Math.min(minAfterTarget,sum);
                    k--;
                }
                else 
                {
                    maxBeforeTarget = Math.max(maxBeforeTarget,sum);
                    j++;
                }
                
                
            }
        }

        if(maxBeforeTarget == Integer.MIN_VALUE)
        {
            return minAfterTarget;
        }
        else if(minAfterTarget == Integer.MAX_VALUE)
        {
            return maxBeforeTarget;
        }


        int result = 0;
        if(Math.abs(target - minAfterTarget) < Math.abs(target - maxBeforeTarget))
        {
            result = minAfterTarget;
        }
        else
        {
            result = maxBeforeTarget;
        }
        return result;
    }
}