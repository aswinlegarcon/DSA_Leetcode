class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++)
        {
            int landRideEnd = landStartTime[i] + landDuration[i];
            for(int j=0;j<waterStartTime.length;j++)
            {
                int waterStart = waterStartTime[j];
                if(waterStart > landRideEnd)
                {
                    int waitTime = waterStart - landRideEnd;
                    min = Math.min(min, landRideEnd + waitTime + waterDuration[j]);
                }
                else
                {
                    min = Math.min(min, landRideEnd + waterDuration[j]);
                }
            }
        }

        for(int i=0;i<waterStartTime.length;i++)
        {
            int waterRideEnd = waterStartTime[i] + waterDuration[i];
            for(int j=0;j<landStartTime.length;j++)
            {
                int landStart = landStartTime[j];
                if(landStart > waterRideEnd)
                {
                    int waitTime = landStart - waterRideEnd;
                    min = Math.min(min, waterRideEnd + waitTime + landDuration[j]);
                }
                else{
                    min = Math.min(min, waterRideEnd + landDuration[j]);
                }
            }
        }
        return min;
        
    }
}