class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {

        int n = asteroids.length;
        Arrays.sort(asteroids);
        long massOfPlanet = mass;
        
        for(int i=0;i<n;i++)
        { 
            if(massOfPlanet >= asteroids[i])
            {
                massOfPlanet += asteroids[i];
            }
            else
            {
                return false;
            }
        }

        return true;

    }
}