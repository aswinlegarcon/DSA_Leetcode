class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int s = flowerbed.length;
        if(n==0) return true;
        if(s==1 && n==1)
        {
            return flowerbed[0]==0?true:false;
        } 
        for(int i=0;i<s;i++)
        {
            if (flowerbed[i] == 0) {
                boolean left = (i == 0) || (flowerbed[i - 1] == 0);
                boolean right = (i == s - 1) || (flowerbed[i + 1] == 0);

                if (left && right) {
                    flowerbed[i] = 1; 
                    n--;  

                    if (n == 0) return true;
                }
            }
        }
        return n<=0?true:false;
    }
}