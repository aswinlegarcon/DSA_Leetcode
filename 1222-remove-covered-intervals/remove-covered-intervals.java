class Solution {

    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> {
            int diff = a[0] - b[0];
            if(diff==0)
            {
                return b[1] - a[1];
            }
            return diff;
        });

        int max = 0;
        int cnt = 0;
        int n = intervals.length;
        for(int i=0;i<n;i++)
        {
            if(intervals[i][1] > max)
            {
                cnt++;
                max = intervals[i][1];
            }
        }
        return cnt;
        
    }

}