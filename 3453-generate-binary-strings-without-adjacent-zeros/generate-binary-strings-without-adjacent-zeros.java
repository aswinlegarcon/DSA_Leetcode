class Solution {
    public List<String> validStrings(int n) {
        List<String> lst = new ArrayList<>();
        helper("0",n,lst);
        helper("1",n,lst);
        return lst;
    }

    private void helper(String s,int n, List<String> lst)
    {
        if(s.length()>=n)
        {
            lst.add(s);
            return;
        }
        if(s.charAt(s.length()-1)=='0')
        {
            helper(s + "1",n,lst);
        }
        if(s.charAt(s.length()-1)=='1') 
        {
            helper(s + "0",n,lst);
            helper(s + "1",n,lst);
        }
    }
}