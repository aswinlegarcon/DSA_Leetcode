class Solution {
    public double myPow(double x, int n) {
        double result = 1.0;
        long power = n;
        power = Math.abs(power);
        while(power>0)
        {
            if(power%2==0)
            {
                x = x*x;
                power = power/2;
            }
            else if(power%2==1)
            {
                result = result * x;
                power = power-1;
            }
        } 
        if(n<0) return (double)1.0/(double)result; // if given power is negative
        return result;
    }
}