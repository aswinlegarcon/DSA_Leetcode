class Solution {
    public String capitalizeTitle(String title) {
        String arr[] = title.split(" ");
        StringBuilder ans = new StringBuilder();
        for(String s:arr)
        {
            int len = s.length();
            if(len<3)
            {
                String temp = s.toLowerCase();
                ans.append(temp);
                ans.append(" ");
            }
            else
            {
                String temp = "";
                temp += s.substring(0,1).toUpperCase();
                temp += s.substring(1,len).toLowerCase();
                ans.append(temp);
                ans.append(" ");
            }
        }
        return ans.toString().trim();
    }
}