class Solution {
    public int smallestNumber(int n) {
        int total = 2;
        while(total<=n)
        {
            total = total *2;
        }
        return total-1;
    }
}