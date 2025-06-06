class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        for(int i=0;i<n;i++)
        {
            int cnt = 0;
            for(int j=0;j<n;j++)
            {
                char c = boxes.charAt(j);
                if(i==j) continue;
                if(c=='1') cnt+= Math.abs(j-i);
            }
            ans[i] = cnt;
        }
        return ans;
    } 
}