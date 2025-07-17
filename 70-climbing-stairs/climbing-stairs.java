class Solution {
    public int climbStairs(int n) {
        int prev = 1;
        int prev1 = 1;
        if(n==1) return 1;
        for(int i=2;i<=n;i++)
        {
            int current = prev + prev1;
            prev1 = prev;
            prev = current;
        }
        return prev;
    }
}