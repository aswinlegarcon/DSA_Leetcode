class Solution {
    public String baseNeg2(int n)
    {
        StringBuilder sb = new StringBuilder();
        if(n==0)
        {
            return "0";
        }
        while(n!=0)
        {
            int remainder = Math.abs(n%2);
            if(remainder == 0)
            {
                sb.append("0");
                n = n/(-2);
            }
            else if(remainder == 1)
            {
                sb.append("1");
                System.out.println((n-1)/(-2));
                n = (n-1)/(-2);
            }
        }
        return sb.reverse().toString();
        
    }
}