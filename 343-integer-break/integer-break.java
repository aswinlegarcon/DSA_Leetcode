class Solution {
    public int integerBreak(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;

        // separating the digits as 3 is better than 2. (3 gives large product)
        long ans = 1;

        while(n > 4)
        {
            ans = ans * 3;
            n -= 3;
        }

        ans = ans * n;
        return (int)ans;
    }
}