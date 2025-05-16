class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lsum = 0;
        int rsum = 0;
        for(int i=0;i<=k-1;i++)
        {
            lsum += cardPoints[i];
        }
        int max = lsum;
        int rInd = n-1;
        for(int i=k-1;i>=0;i--)
        {
            lsum -= cardPoints[i];
            rsum += cardPoints[rInd];
            max = Math.max(max,lsum+rsum);
            rInd--;
        }
        return max;
    }
}