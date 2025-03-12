class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> number = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(number.containsKey(nums[i]))
            {
                number.put(nums[i],number.get(nums[i])+1);
            }
            else
            {
                number.put(nums[i],1);
            }
        }

        for(int key:number.keySet())
        {
            if(number.get(key)==1)
            {
                return key;
            }
        }
        return -1;
    }
}