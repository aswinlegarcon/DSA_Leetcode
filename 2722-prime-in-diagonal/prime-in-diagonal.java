class Solution {
    public int diagonalPrime(int[][] nums) {
        int prime = 0;
        for(int i=0;i<nums.length;i++)
        {
            int num = nums[i][i];
            if(isPrime(num)) prime = Math.max(num,prime);
            int num2 = nums[i][nums.length-i-1];
            if(isPrime(num2)) prime = Math.max(num2,prime);
        }
        return prime;
    }

    private boolean isPrime(int num)
    {
        if(num<=1) return false;
        for(int i=2;i * i<=num;i++)
        {
            if(num%i==0) return false;
        }
        return true;
    }
}