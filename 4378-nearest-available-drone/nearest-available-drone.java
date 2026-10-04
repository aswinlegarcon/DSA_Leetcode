class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int min = Integer.MAX_VALUE;
        int ind = -1;
        int n = drones.length;
        for(int i=0;i<n;i++)
        {
            int[] drone = drones[i];
            int manDist = (Math.abs((drone[0] - target[0])) + Math.abs((drone[1] - target[1])));
            if(manDist<=drone[2])
            {
                if(manDist<min)
                {
                    min = manDist;
                    ind = i;
                }
            }
        }
        return ind;
    }
}