class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> num = new HashMap<>();
        int preSum = 0;
        int count = 0;
        num.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            preSum += nums[i];
            int remove = preSum - k;
            if(num.containsKey(remove))
            {
                count = count + num.get(remove);
            }
            else
            {
                num.put(remove,0);
                count = count + num.get(remove);
            }
            if(num.containsKey(preSum))
            {
                num.put(preSum,num.get(preSum)+1);
            }
            else
            {
                num.put(preSum,0);
                num.put(preSum,num.get(preSum)+1);
            }
       

        }
        return count;
    }
}