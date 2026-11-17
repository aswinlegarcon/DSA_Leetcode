class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int m = worker.length;
        int[][] jobs = new int[n][2];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = difficulty[i];
            jobs[i][1] = profit[i];
        }
        Arrays.sort(jobs, (a, b) -> Integer.compare(a[0], b[0]));

        // Calculate prefix maximum profit
        int maxProfitSoFar = 0;
        for (int i = 0; i < n; i++) {
            maxProfitSoFar = Math.max(maxProfitSoFar, jobs[i][1]);
            jobs[i][1] = maxProfitSoFar;
        }

        Arrays.sort(worker);
        int ans = 0;
        int jobIndex = 0;
        int maxProfitForCurrentWorker = 0;
        for (int i = 0; i < m; i++) {
            int currentWorkerDifficulty = worker[i];
            // Process all jobs this worker can perform
            while (jobIndex < n && jobs[jobIndex][0] <= currentWorkerDifficulty) 
            {
                maxProfitForCurrentWorker = Math.max(maxProfitForCurrentWorker,jobs[jobIndex][1]);
                jobIndex++;
            }
            ans += maxProfitForCurrentWorker;
        }
        return ans;
    }
}
