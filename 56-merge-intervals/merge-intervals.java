class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] ans = new int[intervals.length][2];
        int index = 0;
        Arrays.sort(intervals,(obj1,obj2)->{
                int diff = Integer.compare(obj1[0],obj2[0]);
                if(diff==0) return Integer.compare(obj1[1],obj2[1]);
                return diff;
            });
        for(int i=0;i<intervals.length;i++)
        {
            if(index == 0 || ans[index - 1][1] < intervals[i][0])
            {
                ans[index] = intervals[i];
                index++;
            }
            else
            {
                ans[index-1][1] = Math.max(ans[index-1][1],intervals[i][1]);
            }
        }
        return Arrays.copyOf(ans, index);
    }
}