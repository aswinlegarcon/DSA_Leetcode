class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        for(int i=1;i<=nums.length;i++){
            int num = nums[i-1];
            if(nums.length % i == 0)
            {
                int square = num*num;
                sum += square;
            }
        }
        return sum;
    }
}