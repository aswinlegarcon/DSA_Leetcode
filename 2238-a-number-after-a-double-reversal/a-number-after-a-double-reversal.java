class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp = num;
        int rev = 0;
        while(temp>0)
        {
            int rem = temp%10;
            rev = rev * 10 + rem;
            temp = temp/10;
        }
        temp = rev;
        rev = 0;
        while(temp>0)
        {
            int rem = temp%10;
            rev = rev * 10 + rem;
            temp = temp/10;
        }

        return rev==num?true:false;
    }
}