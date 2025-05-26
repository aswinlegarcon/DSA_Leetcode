class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        int index = 0;
        for(int i=1;i<releaseTimes.length;i++)
        {
            if(releaseTimes[i] - releaseTimes[i-1] == max)
            {
                if(keysPressed.charAt(index) < keysPressed.charAt(i))
                {
                    index = i;
                }
            }
            if(releaseTimes[i] - releaseTimes[i-1] > max)
            {
                max = releaseTimes[i] - releaseTimes[i-1];
                index = i;
            }
        }
        return keysPressed.charAt(index);
    }
}