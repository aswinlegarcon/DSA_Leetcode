class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1)
        {
            return false;
        }
        else if(n==1)
        {
            return true;
        }
        double num  = Math.abs(n);
        return helpPow(num);
    }
    public boolean helpPow(double n)
    {
        if(n==1.0)
        {
            return true;
        }
        else if(n%3 != 0)
        {
            return false;
        }
        else if(n<1)
        {
            return false;
        }
        return helpPow(n/3);
    }

}