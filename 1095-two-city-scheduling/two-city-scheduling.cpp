class Solution {
public:

    static bool comp(vector<int>& a,vector<int>& b)
    {
        int sum1 = a[0] - a[1];
        int sum2 = b[0] - b[1];
        if(sum1<sum2) return true;
        return false;
    }

    int twoCitySchedCost(vector<vector<int>>& costs) {
        sort(costs.begin(),costs.end(),comp);
        int sum = 0;
        int n = costs.size();
        for(int i=0;i<n;i++)
        {
            if(i<n/2) sum += costs[i][0];
            else sum += costs[i][1];
        }
        return sum;
    }
};