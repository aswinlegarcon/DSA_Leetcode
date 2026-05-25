class Solution {

    public int mostFrequent(int[] nums, int key) {
        int hash[] = new int[1001];
        int maxCount = 0;
        int maxNum = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==key)
            {
                hash[nums[i+1]]++;
                if(hash[nums[i+1]] > maxCount)
                {
                    maxCount = hash[nums[i+1]];
                    maxNum = nums[i+1];
                }
            }
        }
        return maxNum;
    }

}