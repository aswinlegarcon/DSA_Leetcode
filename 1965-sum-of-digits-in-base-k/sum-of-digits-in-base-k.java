class Solution {
    public int sumBase(int n, int k) {
        String result = "";
        if(n==0)
        {
            result = "0";
        }
        if(k==10)
        {
            result = ""+n;
        }
        else
        {
             while(n>0)
            {
                int remainder = n%k;
                result = remainder + "" + result;
                n = n/k;
            }
        }
       
        int sum = 0;
        for(char num:result.toCharArray())
        {
            
            sum += Character.getNumericValue(num);
        }
        return sum;
    }
}