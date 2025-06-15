class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        char maxChange = '0';
        char minChange = '0';
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c!='9')
            {
                maxChange = c;
                break;
            } 
        }

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c!='0')
            {
                minChange = c;
                break;
            } 
        }

        StringBuilder max = new StringBuilder(s);
        StringBuilder min = new StringBuilder(s);

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c==maxChange)
            {
                max.setCharAt(i,'9');
            }
            if(c==minChange)
            {
                min.setCharAt(i,'0');
            }
        }

        return Integer.parseInt(max.toString()) - Integer.parseInt(min.toString());

    }
}