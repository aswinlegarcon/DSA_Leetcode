class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int ind = 0;
        int n = bits.length;
        while(ind<n)
        {
            if(ind==n-1) return true;
            if(bits[ind]==1)
            {
                ind += 2;
            }
            else 
            {
                ind += 1;
            }
        }
        return false;
    }
}