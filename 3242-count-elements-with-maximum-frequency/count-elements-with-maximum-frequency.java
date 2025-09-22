class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] hash = new int[101];
        for(int i=0;i<nums.length;i++)
        {
            hash[nums[i]]++;
        }
        int max = 0;
        int cnt = 0;
        for(int i=1;i<=100;i++)
        {
            if(hash[i]>max)
            {
                max = hash[i];
                cnt = 1;
            }
            else if(hash[i]==max)
            {
                cnt++;
            }
        }
        return max*cnt;
    }
}