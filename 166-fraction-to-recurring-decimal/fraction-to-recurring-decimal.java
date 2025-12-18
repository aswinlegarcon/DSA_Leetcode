class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder sb = new StringBuilder();
        if(numerator==0) return "0";
        if((numerator<0) ^ (denominator<0)) sb.append("-");
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);
        // int 
        sb.append(num/den);
        long rem = num%den;
        if(rem==0) return sb.toString();
        sb.append(".");
        HashMap<Long,Integer> map = new HashMap<>(); // rem,ind (for recursive answer)

        while(rem!=0)
        {
            if(map.get(rem)!=null)
            {
                int ind = map.get(rem);
                sb.insert(ind,"(");
                sb.append(")");
                return sb.toString();
            }
            map.put(rem,sb.length());
            rem = rem*10;
            sb.append(rem/den);
            rem = rem%den;
        }

        return sb.toString();

    }
}