class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> lst = new ArrayList<>();
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(isVowel(c))
            {
                lst.add(c);
            }
        }
        Collections.sort(lst);
        StringBuilder sb = new StringBuilder();
        int ind = 0;
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(isVowel(c))
            {
                sb.append(lst.get(ind));
                ind++;
            }
            else
            {
                sb.append(c);
            }
        }
        return sb.toString();

    }

    private boolean isVowel(char c)
    {
        if(c=='a' || c=='e'|| c=='i'|| c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') return true;
        return false;
    }
}