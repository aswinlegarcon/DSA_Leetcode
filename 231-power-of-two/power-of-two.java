class Solution {
    public boolean isPowerOfTwo(int n) {
        double num = n;
        if(n==1)
        {
            return true;
        }
        if(n%2!=0)
        {
            return false;
        }
        return helpPower(num,0);
    }
    public boolean helpPower(double n,int i)
    {
        if(n==1.0)
        {
            return true;
        }
        else if(n==0)
        {
            return false;
        }
        return helpPower(n/2,i+1);
    }
}