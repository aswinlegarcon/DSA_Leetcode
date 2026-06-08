class Solution {
    public boolean isAnagram(String s, String t) {
        int[] hash = new int[26];
        
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        if(arr1.length != arr2.length) return false;
        for(int i=0;i<arr1.length;i++)
        {
            hash[arr1[i]-'a']++;
        }

        for(int i=0;i<arr2.length;i++)
        {
            hash[arr2[i]-'a']--;
        }

        for(int i=0;i<26;i++)
        {
            if(hash[i]!=0) return false;
        }
        return true;

    }
}