// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        // code here
         Arrays.sort(bt);
         int time = 0;
         int wait = 0;
         for(int task:bt)
         {
             wait += time;
             time += task;
         }
         
         return wait/bt.length;
    }
}
