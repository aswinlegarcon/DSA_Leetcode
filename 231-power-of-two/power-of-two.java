class Solution {
    public boolean isPowerOfTwo(int n) {
        // power of 2's binary will always be like 10000,100,100000000
        // if we unset the rightmost bit and the value becomes 0 then it is a power of 2
        if(n<=0) return false;
        int unset = n & (n-1); // unsetting the rightmost bit
        if(unset==0)
        {
            return true;
        }
        return false;
    }
}