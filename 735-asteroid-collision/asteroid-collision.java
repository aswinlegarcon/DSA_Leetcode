class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        int[] result = new int[n];
        int index = -1;
        for(int i=0;i<n;i++)
        {
            if(asteroids[i] > 0)
            {
                index++;
                result[index] = asteroids[i];
            } 
            else
            {
                while(index!=-1 && result[index] > 0 && result[index] < Math.abs(asteroids[i]))
                {
                    index--;
                }
                if(index!=-1 && result[index] == Math.abs(asteroids[i]))
                {
                    index--;
                }
                else if(index==-1 || result[index] < 0)
                {
                    index++;
                    result[index] = asteroids[i];
                }
            }
        }
        if(index==-1) return new int[]{};
        return Arrays.copyOf(result,index+1);
    }
}