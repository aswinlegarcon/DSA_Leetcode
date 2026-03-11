class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int len = (int)(Math.log(n) / Math.log(2)) + 1;
        int mask = (int)(Math.pow(2,len)) - 1;
        return n ^ mask;
    }
}