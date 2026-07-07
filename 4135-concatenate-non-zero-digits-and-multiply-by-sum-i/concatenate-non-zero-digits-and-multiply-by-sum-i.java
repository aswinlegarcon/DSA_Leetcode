class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int rem = n%10;
            if(rem!=0){
                sum+=rem;
                sb.append(""+rem);
            }
            n/=10;
        }
        if(sum==0) return 0;
        long num = Long.parseLong(sb.reverse().toString());
        return (long)num * (long)sum;
    }
}