class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;

        int empty = numBottles%numExchange;
        numBottles = numBottles/numExchange + empty;
        while(numBottles >= numExchange)
        {
            total += numBottles - empty;
            empty = numBottles%numExchange;
            numBottles = numBottles/numExchange + empty;
        }
        total += numBottles - empty;
        return total;
    }
}