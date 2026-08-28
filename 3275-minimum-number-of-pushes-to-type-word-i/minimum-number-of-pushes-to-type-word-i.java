class Solution {
    
    public int minimumPushes(String word) {

        int cnt = 0;
        int n = word.length();
        if(n<=8) return n;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int size = map.size();
            char c = word.charAt(i);
            if(map.containsKey(c))
            {
                cnt += map.get(c);
            }
            else if(size<8)
            {
                map.put(c,1);
                cnt += 1;
            }
            else if(size>=8 && size<16)
            {
                map.put(c,2);
                cnt += 2;
            }
            else if(size>=16 && size<24)
            {
                map.put(c,3);
                cnt += 3;
            }
            else
            {
                map.put(c,4);
                cnt += 4;
            }
        }

        return cnt;

    }
}