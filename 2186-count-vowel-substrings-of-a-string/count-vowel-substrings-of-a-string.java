class Solution {
    public int countVowelSubstrings(String word) {
        int cnt = 0;
        int n = word.length();
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        for(int i=0;i<n;i++)
        {
            int vow[] = new int[5];
            for(int j=i;j<n;j++)
            {
                char c = word.charAt(j);
                if(!set.contains(c)) break;
                int ind = getIndex(c);
                if(ind!=-1) vow[ind]++;
                if(getCnt(vow))
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public boolean getCnt(int arr[])
    {
        for(int a:arr)
        {
            if(a==0) return false;
        }
        return true;
    }

    public int getIndex(char c)
    {
        return "aeiou".indexOf(c);
    }
}