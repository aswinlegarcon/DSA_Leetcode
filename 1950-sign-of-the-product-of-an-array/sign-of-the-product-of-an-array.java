class Solution {
    public int arraySign(int[] nums) {
        int prod = 1;
        for(int num:nums)
        {
            if(num==0) 
            {
                prod = 0;
                return 0;
            }
            if(num>0) prod *= 1;
            else prod *= -1;
        }

        return signFunc(prod);
    }

    private int signFunc(int prod)
    {
        if(prod>0) return 1;
        else if(prod==0) return 0;
        return -1;
    }
}