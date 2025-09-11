class Solution {

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        
        PriorityQueue<double[]> pq = new PriorityQueue<>( (a,b) -> {
            return Double.compare(b[0],a[0]);
        });
        
        int n = classes.length;
        for(int i=0;i<n;i++)
        {
            double pass = classes[i][0];
            double total = classes[i][1];
            double ratio = (pass+1.0)/(total+1.0) - pass/total;
            pq.add(new double[]{ratio,pass,total});
        }

        while(extraStudents>0)
        {

            double arr[] = pq.poll();
            double pass = arr[1]+1;
            double total = arr[2]+1;
            double ratio = (pass+1.0)/(total+1.0) - pass/total;
            pq.add(new double[]{ratio,pass,total});
            extraStudents--;
        }
        double sum = 0.0;
        while(pq.size()>0)
        {
            double[] arr = pq.poll();
            sum += arr[1]/arr[2];
        }

        return sum/n;
    }
}