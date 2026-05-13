class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=lowLimit;i<=highLimit;i++)
        {
            int sum = getSum(i);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        int max = 0;
        for(var key:map.keySet())
        {
            max = Math.max(map.get(key),max);
        }
        return max;
    }

    private int getSum(int num)
    {
        int sum = 0;
        while(num>0)
        {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}