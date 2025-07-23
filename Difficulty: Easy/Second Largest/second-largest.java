class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = 0;
        int max2 = 0;
        for(int num:arr)
        {
            if(num>max)
            {
                max2 = max;
                max = num;
            }
            else if(num<max && num>max2) max2 = num;
        }
        return max2==0?-1:max2;
    }
}