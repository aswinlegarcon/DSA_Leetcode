class Solution {
    public int[][] merge(int[][] intervals) {
        Comparator<int[]> obj = new Comparator<int[]>(){
            public int compare(int[] obj1,int[] obj2)
            {
                return Integer.compare(obj1[0],obj2[0]);
            }
        };
        int[][] ans = new int[intervals.length][2];
        int index = 0;
        Arrays.sort(intervals,obj);
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