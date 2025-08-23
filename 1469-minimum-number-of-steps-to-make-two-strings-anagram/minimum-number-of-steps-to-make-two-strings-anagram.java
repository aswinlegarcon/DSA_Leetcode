class Solution {
    public int minSteps(String s, String t) {
        int hash1[] = new int[26];
        int hash2[] = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            char one = s.charAt(i);
            char two = t.charAt(i);
            hash1[one -'a']++;
            hash2[two -'a']++;
        }
        int cnt = 0;
        for(int i=0;i<26;i++)
        {
            int cnt1 = hash1[i];
            int cnt2 = hash2[i];
            if(cnt1>cnt2) cnt += (cnt1-cnt2);
        }
        return cnt;
    }
}