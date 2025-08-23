class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            char one = s.charAt(i);
            char two = t.charAt(i);
            map1.put(one,map1.getOrDefault(one,0)+1);
            map2.put(two,map2.getOrDefault(two,0)+1);
        }
        int cnt = 0;
        for(var key:map1.keySet())
        {
            int cnt1 = map1.get(key);
            int cnt2 = map2.get(key)==null?0:map2.get(key);
            if(cnt1>cnt2) cnt += (cnt1-cnt2);
        }
        return cnt;
    }
}