class Solution {
    public int fib(int n) {
        if(n<=1)
        {
            return n;
        }
        int firstVal = fib(n-1);
        int secondVal = fib(n-2);
        return firstVal + secondVal;
    }
}