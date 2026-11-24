class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLen = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int[] gcdAndLcm = calculateGcdAndLcm(i,j,nums);
                int product = getProduct(i,j,nums);
                if(product == (gcdAndLcm[0] * gcdAndLcm[1])){
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }

    private int getProduct(int start,int end,int[] nums)
    {
        int prod = 1;
        for(int i=start;i<=end;i++)
        {
            prod *= nums[i];
        }
        return prod;
        
    }
    private int[] calculateGcdAndLcm(int start,int end,int[] nums)
    {
        int gcdOfArr = nums[start];
        int lcmOfArr = nums[start];
        for(int i=start+1;i<=end;i++){
            gcdOfArr = gcd(nums[i],gcdOfArr);
            lcmOfArr = lcm(nums[i],lcmOfArr);
        }
        return new int[]{gcdOfArr,lcmOfArr};
    }

    private int gcd(int a,int b)
    {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int lcm(int a,int b)
    {
        return (a / gcd(a, b) * b);
    }
}