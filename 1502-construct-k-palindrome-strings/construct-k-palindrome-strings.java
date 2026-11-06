class Solution {
    public boolean canConstruct(String s, int k) {
        int n = s.length();
        if(n<k) return false;

        int[] hash = new int[26];
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            hash[c-'a']++;
        }
        int oddCount = 0;
        for(int i=0;i<26;i++)
        {   
            if(hash[i]%2 != 0) oddCount++;
            if(oddCount>k) return false;
        }
        return true;
    }
}