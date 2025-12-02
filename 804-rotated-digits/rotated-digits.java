class Solution {
    public int rotatedDigits(int n) {
        int cnt = 0;
        for(int i=1;i<=n;i++)
        {
            if(helper(i)) cnt++;
        }
        return cnt;
    }

    private boolean helper(int i)
    {
        boolean check = false;
        while(i>0)
        {
            int rem = i%10;
            if(rem==2 || rem==5 || rem == 6 || rem == 9) check = true;
            if(rem == 3 || rem ==4 || rem == 7) return false;
            i = i/10;
        }
        return check;
    }
}