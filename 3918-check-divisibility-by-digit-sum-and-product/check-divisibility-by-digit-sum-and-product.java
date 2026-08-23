class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int num = n;
        while(n>0)
        {
            int rem = n%10;
            n = n/10;
            sum += rem;
            prod *= rem;
        }
        int total = sum+prod;
        return num%total==0;
    }
}