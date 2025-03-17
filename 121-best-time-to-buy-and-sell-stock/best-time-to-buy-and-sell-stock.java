class Solution {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int price = 0;
        for(int i =1;i<prices.length;i++)
        {
            if(prices[i] < buy)
            {
                buy = prices[i];
            }
            else
            {
                price = Math.max(price,prices[i] - buy);
            }
        }
        return price;
    }
}