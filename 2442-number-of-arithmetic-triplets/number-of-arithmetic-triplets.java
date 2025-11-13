class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int cnt = 0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    int numi = nums[i];
                    int numj = nums[j];
                    int numk = nums[k];
                    if(numj-numi == diff && numk-numj == diff) cnt++;
                }
            }
            
        }
        return cnt;
    }
}