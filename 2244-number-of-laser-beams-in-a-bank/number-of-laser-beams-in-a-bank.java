class Solution {
    public int numberOfBeams(String[] bank) {
        int cnt = 0;
        int n = bank.length;
        int i = 0;
        int j = 1;
        while(j<n)
        {
            String one = bank[i];
            String two = bank[j];
            int cnt1 = getCount(one);
            int cnt2 = getCount(two);
            if(cnt1==0)
            {
                i++;
                j++;
                continue;
            }
            else if(cnt2>0)
            {
                cnt = cnt + (cnt1*cnt2);
            }
            else
            {
                j++;
                continue;
            }
            i = j;
            j++; 
        }
        return cnt;
    }

    private int getCount(String temp)
    {
        int cnt = 0;
        for(int i=0;i<temp.length();i++)
        {
            if(temp.charAt(i)=='1') cnt++;
        }
        return cnt;
    }
}