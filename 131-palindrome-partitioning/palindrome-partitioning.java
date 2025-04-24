class Solution {
    public void help(int index,String s,List<String> ds,List<List<String>> ans)
    {
        if(index==s.length())
        {
            ans.add(new ArrayList<>(ds));
        }
        for(int i=index;i<s.length();i++)
        {
            if(isPalindrome(s,index,i))
            {
                ds.add(s.substring(index,i+1));
                help(i+1,s,ds,ans);
                ds.remove(ds.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s,int start,int end)
    {
        while(start<=end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {

        List<List<String>> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        help(0,s,ds,ans);
        return ans;
    }
}