class Solution {
    public boolean checkValidString(String s) {
        int min = 0;
        int max = 0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='(')
            {
                min++;
                max++;
            }
            else if(c==')')
            {
                min--;
                max--;
            }
            else
            {
                if(min>0)
                {
                    min--;
                }
                max++;
            }
            if(min<0) min = 0;
            if(max<0) return false;
        }
        if(min==0) return true;
        return false;
    }

    public boolean helper(String s,int cnt,int ind)
    {
        if(cnt<0) return false;
        if(ind==s.length()) return (cnt==0);
        char c = s.charAt(ind);
        if(c=='(') return helper(s,cnt+1,ind+1);
        if(c==')') return helper(s,cnt-1,ind+1);
        
        return helper(s,cnt+1,ind+1) || helper(s,cnt-1,ind+1) || helper(s,cnt,ind+1);
        
    }
}