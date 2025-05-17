class Solution {
    public int numberOfSubstrings(String s) {
        int a = -1;
        int b = -1;
        int c = -1;
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            switch(s.charAt(i))
            {
                case 'a':
                    a = i;
                    break;
                case 'b':
                    b = i;
                    break;
                case 'c':
                    c = i;
                    break;
            }
            if(a!=-1 && b!=-1 && c!=-1)
            {
                count = count + (1+Math.min(a,Math.min(b,c)));
            }
        }
        return count;
    }
}