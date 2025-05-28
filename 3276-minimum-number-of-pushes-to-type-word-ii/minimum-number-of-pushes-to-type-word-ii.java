class Solution {
    public int minimumPushes(String word) {
        
        Map<Character,Integer> mapC = new HashMap<>();
        int cntFor8 = 0;
        for(int i=0;i<word.length();i++)
        {
            if(mapC.containsKey(word.charAt(i)))
            {
                mapC.put(word.charAt(i),mapC.get(word.charAt(i))+1);
                cntFor8++;
            }
            else
            {
                mapC.put(word.charAt(i),1);
                cntFor8++;
            }

        }
        if(mapC.size()<=8)
        {   
            return cntFor8;
        }

        TreeMap<Character,Integer> map = new TreeMap<>(
            (key1, key2) -> {
                    int comp = Integer.compare(mapC.get(key2), mapC.get(key1));
                    if (comp == 0) {
                        return Character.compare(key1, key2);
                    }
                    return comp;
                });
        map.putAll(mapC);
        int toMultiply = 1;
        int cnt = 0;
        int min = 0;
        for(int vals:map.values())
        {
            cnt++;
            if(cnt==9 || cnt==17 || cnt==25) toMultiply++;
            min += (toMultiply*vals);
        }

    return min;
    }
}