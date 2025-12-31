class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int n = intervals.length;
        if(n==0) return new int[][]{newInterval};

        int[][] ans = new int[n+1][2];
        int index = 0;
        int i = 0;
        while(i<n && intervals[i][1] < newInterval[0])
        {
            ans[index] = intervals[i];
            i++;
            index++;
        }

        while(i<n && intervals[i][0] <= newInterval[1])
        {
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        
        ans[index] = newInterval;
        index++;

        while(i<n)
        {
            ans[index] = intervals[i];
            i++;
            index++;
        }

        return Arrays.copyOf(ans,index);

    }
}