class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int limit = (n/4)+1;
        int currNum = arr[0];
        int currCount = 1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]==currNum) currCount++;
            else{
                currNum = arr[i];
                currCount = 1;
            }
            if(currCount >= limit) return currNum;
        }
        return currNum;
    }
}