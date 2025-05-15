class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLen = 0;
        int left = 0;
        int right = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(right<=s.length()-1)
        {
            char c  = s.charAt(right);
            if(map.containsKey(c))
            {
                if(map.get(c)>=left)  left = map.get(c)+1;
                map.put(c,right);
            }
            else
            {
                map.put(c,right);
            }
            maxLen = Math.max(maxLen,right-left+1);
            right++;
            
            
        }
        return maxLen;
    }
}