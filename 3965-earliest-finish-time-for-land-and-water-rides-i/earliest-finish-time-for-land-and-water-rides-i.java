class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min = Integer.MAX_VALUE;
        
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int i = 0;
        
        while(i < n && i < m)
        {
            int landRideEnd = landStartTime[i] + landDuration[i];
            int waterRideEnd = waterStartTime[i] + waterDuration[i];
            int j = 0;
            while(j < n && j < m)
            {
                int waterStart = waterStartTime[j];
                int landStart = landStartTime[j];
                if(waterStart > landRideEnd)
                {
                    int waitTime = waterStart - landRideEnd;
                    min = Math.min(min, landRideEnd + waitTime + waterDuration[j]);
                }
                else
                {
                    min = Math.min(min, landRideEnd + waterDuration[j]);
                }
                if(landStart > waterRideEnd)
                {
                    int waitTime = landStart - waterRideEnd;
                    min = Math.min(min, waterRideEnd + waitTime + landDuration[j]);
                }
                else{
                    min = Math.min(min, waterRideEnd + landDuration[j]);
                }
                j++;
            }

            while(j < m)
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
                j++;
            }

            while(j < n)
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
                j++;
            }
            i++;

        }


        while(i < n)
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
            i++;
        }


        while(i < m)
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
            i++;
        }


        return min;
        
    }
}