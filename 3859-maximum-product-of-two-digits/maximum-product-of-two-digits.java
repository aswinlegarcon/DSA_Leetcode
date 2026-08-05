class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        int max2 = max;
        while(n>0)
        {
            int rem = n%10;
            if(rem>max)
            {
                max2 = max;
                max = rem;
            }
            else if(rem>max2)
            {
                max2 = rem;
            }
            n = n/10;
        }
        return max*max2;
    }
}