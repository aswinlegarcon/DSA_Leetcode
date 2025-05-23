class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        int indexChange = 0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                indexChange++;
            }
        }
        
        if(indexChange==2)
        {
            int ind1 = -1;
            int ind2 = -1;
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))
                {
                    if(ind1==-1)
                    {
                        ind1 = i;
                    }
                    else
                    {
                        ind2 = i;
                    }
                }
            }
            StringBuilder sb = new StringBuilder(s2);
            sb.setCharAt(ind1,s2.charAt(ind2));
            sb.setCharAt(ind2,s2.charAt(ind1));
            if(s1.equals(sb.toString())) return true;
        }

        

        return false;
    }
}