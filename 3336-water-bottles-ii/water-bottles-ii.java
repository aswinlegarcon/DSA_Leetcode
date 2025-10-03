class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;
        numBottles = 0;

        while(numExchange <= empty + numBottles)
        {
            if(numExchange <= empty)
            {
                numBottles += 1;
                empty -= numExchange;
                numExchange++;
            }
            else
            {
                total += numBottles;
                empty += numBottles;
                numBottles = 0;
            }
        }
        
        total += numBottles;
        return total;
    }
}