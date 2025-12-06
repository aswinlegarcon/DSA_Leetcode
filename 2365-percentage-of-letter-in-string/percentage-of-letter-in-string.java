class Solution {
    public int percentageLetter(String s, char letter) {

        int cnt = 0;
        int n = s.length();

        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==letter) cnt++;
        }
        
        double ans = ((double)cnt/(double)n) * 100;
        return (int)ans;

    }
}