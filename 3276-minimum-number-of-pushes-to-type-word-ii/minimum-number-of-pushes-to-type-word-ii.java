class Solution {
    public int minimumPushes(String word) {
        
        int[] hash = new int[26];
        for(int i=0;i<word.length();i++)
        {
            hash[word.charAt(i)-'a']++;
        }
        Arrays.sort(hash);
        int cnt = 0;
        int min = 0;
        int toMultiply = 1;
        for(int i=25;i>=0;i--)
        {
            if(hash[i]==0) break;
            int vals = hash[i];
            cnt++;
            if(cnt==9 || cnt==17 || cnt==25) toMultiply++;
            min += (toMultiply*vals);
        }

    return min;
    }
}