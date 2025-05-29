class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumOfAlice = 0;
        int sumOfBob = 0;
    
        int n = aliceSizes.length;
        int m = bobSizes.length;
        for(int i=0;i<n;i++)
        {
            sumOfAlice += aliceSizes[i];
        }
        for(int i=0;i<m;i++)
        {
            sumOfBob += bobSizes[i];
        }
        int diff = sumOfAlice - sumOfBob;
        
        if(n>=m)
        {
            for(int i=0;i<aliceSizes.length;i++)
            {
                for(int j=0;j<bobSizes.length;j++)
                {
                    int sumA = sumOfAlice;
                    int sumB = sumOfBob;
                    int el1 = aliceSizes[i];
                    int el2 = bobSizes[j];
                    sumA -= el1;
                    sumB -= el2;
                    sumA += el2;
                    sumB += el1;
                    if(sumA-sumB == 0) return new int[]{el1,el2};
                }
            }
        }
        else
        {
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    int sumA = sumOfAlice;
                    int sumB = sumOfBob;
                    int el1 = aliceSizes[j];
                    int el2 = bobSizes[i];
                    sumA -= el1;
                    sumB -= el2;
                    sumA += el2;
                    sumB += el1;
                    if(sumA-sumB == 0) return new int[]{el1,el2};
                }
            }
        }
        
        
    return new int[]{0,0};
    }
}