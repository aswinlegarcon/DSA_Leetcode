class Solution {
    public int countPrimeSetBits(int left, int right) {
        int cnt = 0;
        for(int i=left;i<=right;i++)
        {
            int bit = Integer.bitCount(i);
            if(isPrime(bit)) cnt++;
        }
        return cnt;
    }

    private boolean isPrime(int n)
    {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}