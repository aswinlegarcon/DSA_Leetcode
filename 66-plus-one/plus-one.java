class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i=len-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++; // if it is less than 9 then simply add 1 to it and return
                return digits;
            }
            else
            {
                digits[i] = 0; // change 0 for 9 and in next iteration the before number will be changed eg: 19 - 9 will change here 1 will change to 2 in the next iteration
            }
        }
        digits = new int[len+1]; // if all digits are 9 make the array size increase by 1 and add 1 in the 0th index eg: 999 - 1000
        digits[0] = 1;
        return digits;

    }
}