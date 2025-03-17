class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numAndInd = new HashMap<>();
        int result[] = new int[2];
        for(int i =0;i<nums.length;i++)
        {
            int numToFind = target - nums[i];
            if(numAndInd.containsKey(numToFind))
            {
                result[0] = i;
                result[1] = numAndInd.get(numToFind);
            }
            numAndInd.put(nums[i],i);
        }
        return result;
    }
}