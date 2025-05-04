class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(ans,"",0,0,n);
        return ans;
    }

    public void generate(List<String> ans, String s, int open,int close,int max)
    {
        if(s.length() == 2*max)
        {
            ans.add(s);
            return;
        }

        if(open < max) generate(ans,s+'(',open+1,close,max);
        if(close < open) generate(ans,s+')',open,close+1,max);
    }
}