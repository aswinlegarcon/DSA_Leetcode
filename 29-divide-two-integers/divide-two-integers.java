class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor)
        {
            return 1;
        }
        boolean sign = true;
        if(dividend >= 0 && divisor < 0) sign = false;
        if(dividend <= 0 && divisor > 0) sign = false;
        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        long ans = 0;
        while(n >= d)
        {
            int cnt = 0;
            while(n >= (d<<(cnt+1))) // n >= 2^cnt+1 (2 poer cnt+1)
            {
                cnt++;
            }
            ans = ans + (1L <<cnt); // treat long correctly
            n = n - (d<<cnt);
        }
        System.out.println(ans);
        if (ans > Integer.MAX_VALUE)
        {
            return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return sign?(int)ans:(int)-ans;
        
        
    }
}