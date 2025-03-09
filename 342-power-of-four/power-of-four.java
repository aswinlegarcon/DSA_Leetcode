class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<0)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        return helpMethod((double)n); 
    }

    public boolean helpMethod(double num)
    {
        if(num == 1.0)
        {
            return true;
        }
        else if(num%4 != 0)
        {
            return false;
        }
        else if(num<1)
        {
            return false;
        }
        return helpMethod(num/4);
    }
}