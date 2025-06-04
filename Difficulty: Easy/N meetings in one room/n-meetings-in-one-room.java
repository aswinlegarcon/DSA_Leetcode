class Data
{
    int start;
    int end;
    
    Data(int s, int e) {
        this.start = s;
        this.end = e;
    }
}

class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        Data[] arr = new Data[start.length];
        for (int i = 0; i < start.length; i++) 
        {
            arr[i] = new Data(start[i], end[i]);
        }
        
        
        Arrays.sort(arr,(data1,data2)->{
            int diff = data1.end - data2.end;
            if(diff==0) return data1.start - data2.start;
            return diff;
        });
        
        int cnt = 1;
        int lastEnd = arr[0].end;
        for(int i=1;i<start.length;i++)
        {
            if(arr[i].start > lastEnd)
            {
                cnt++;
                lastEnd = arr[i].end;
            }
        }
        
        return cnt;
    }
}
