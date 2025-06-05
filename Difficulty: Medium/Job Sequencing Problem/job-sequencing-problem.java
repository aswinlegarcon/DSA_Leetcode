class Job
{
    int profit;
    int deadline;
    
    public Job(int profit,int deadline)
    {
        this.profit = profit;
        this.deadline = deadline;
    }
}

class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        Job[] arr = new Job[deadline.length];

        for (int i = 0; i < deadline.length; i++) {
            arr[i] = new Job(profit[i], deadline[i]);
        }

        Arrays.sort(arr, (job1, job2) -> job2.profit - job1.profit); // DESCENDING profit

        int maxDeadline = -1;
        for(int d:deadline)
        {
            maxDeadline = Math.max(d,maxDeadline);
        }
        
        int[] slots = new int[maxDeadline + 1]; // index 1 to maxDeadline
        int count = 0, totalProfit = 0;

        for (Job job : arr) {
            for (int j = job.deadline; j >= 1; j--) {
                if (slots[j] == 0) {
                    slots[j] = 1; // mark slot as filled
                    count++;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        return new ArrayList<>(Arrays.asList(count, totalProfit));
    }
}