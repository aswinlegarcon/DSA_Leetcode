class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(i=0;i<s.length()-2;i++)
        {
            char c = s.charAt(i);
            if(c==s.charAt(i+1) && c==s.charAt(i+2))
            {
                continue;
            }
            sb.append(c);
        }
        while(i<s.length())
        {
            char c = s.charAt(i);
            sb.append(c);
            i++;
        }
        return sb.toString();

    }
}