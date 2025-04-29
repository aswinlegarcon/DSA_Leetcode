class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = start ^ goal; // return no.of flips needed as 1
        int cnt = 0;
        while(ans>0)// removing the rigthmost setbit until it reaches 0 and increse count
        {
            ans = ans&(ans-1);
            cnt++;
        }
        return cnt;
    }
}