class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum = getSum(nums[i]);
            if(map.containsKey(sum))
            {
                int numInMap = map.get(sum);
                int curNum = nums[i];
                max = Math.max(max,numInMap+curNum);
                if(curNum>numInMap) map.put(sum,curNum);
            }
            else
            {
                map.put(sum,nums[i]);
            }

        }
        return max==Integer.MIN_VALUE?-1:max;

    }

    private int getSum(int n)
    {
        int sum = 0;
        while(n>0)
        {
            sum += n%10;
            n/=10;
        }
        return sum;
    }
}