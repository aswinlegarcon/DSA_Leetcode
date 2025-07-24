class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder ans = new StringBuilder();
        s = s.replaceAll("-","");
        int index = 0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(index==k)
            {
                ans.append("-");
                index = 0;
            }
            index++;
            ans.append(Character.toUpperCase(s.charAt(i)));
        }
        return ans.reverse().toString();
    }
}