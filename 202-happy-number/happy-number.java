class Solution {
    public boolean isHappy(int n) {
        // like linked list tortoise (slow/fast) to detect cycle
        int slow = n;
        int fast = n;
        slow = help(slow);
        fast = help(help(fast));
        while(slow!=fast)
        {
            slow = help(slow);
            fast = help(help(fast));
        }
        return slow==1;
    }

    private int help(int num)
    {
        int ans = 0;
        while(num>0)
        {
            int rem = num%10;
            ans += rem*rem;
            num = num/10;
        }
        return ans;
    }
}