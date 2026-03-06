class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        int ind = -1;
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i)=='0')
            {
                ind = i;
                break;
            }
        }
        if(ind==-1 || ind==n-1) return true;
        String sub = s.substring(ind+1,n);
        if(sub.contains("1")) return false;
        return true;
    }
}