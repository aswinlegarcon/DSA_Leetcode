class Solution {
    public int twoCitySchedCost(int[][] costs) {
        
        Arrays.sort(costs,(a,b)->{
            int sum1 = a[0] - a[1];
            int sum2 = b[0] - b[1];
            if(sum1<sum2) return -1;
            else return 1;
        });
        int sum = 0;
        int n = costs.length;
        for(int i=0;i<n;i++)
        {
            if(i<n/2) sum += costs[i][0];
            else sum += costs[i][1];
        }
        return sum;
    }
}