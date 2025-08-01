class Solution {
    public int climbStairs(int n) {
        int prev = 1;
        int prev2 = 1;
        if(n==1) return 1;
        for(int i=2;i<=n;i++)
        {
            int current = prev + prev2;
            prev2 = prev;
            prev = current;
        }
        return prev;
    }
}