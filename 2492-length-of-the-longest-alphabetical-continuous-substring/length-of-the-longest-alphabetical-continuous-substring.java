class Solution {
    public int longestContinuousSubstring(String s) {
        int l = 0;
        int r = 0;
        int n = s.length()-1;
        int max = 0;
        if(s.length()==1) return 1;
        while(r<n-1)
        {
            if(r<n-1 && s.charAt(r)+1!=s.charAt(r+1))
            {
                 r++;
                 l++;
            }
            else
            {
                while(r<=n-1 && s.charAt(r)+1==s.charAt(r+1))
                {
                    r++;
                    max = Math.max(max,r-l+1);
                    System.out.println(r+" "+max);
                }
                l = r;
            } 
        }
        if(max==0) max = 1;
        return max;
    }
}