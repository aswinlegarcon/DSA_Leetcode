class Solution {
    public int findLucky(int[] arr) {
        int luckyNum = -1;
        int[] hash = new int[501];
        for(int i=0;i<arr.length;i++)
        {
            hash[arr[i]]++;
        }
        for(int i=1;i<hash.length;i++)
        {
            if(i==hash[i]) luckyNum = i;
        }
        return luckyNum;
    }
}