class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        Comparator<Character> comp = (ob1,ob2) -> 
        {
            int val = Integer.compare(map.get(ob2),map.get(ob1));
            if(val == 0) return ob1.compareTo(ob2);
            return val;
        };
        TreeMap<Character,Integer> tmap = new TreeMap<>(comp);
        tmap.putAll(map); 

        for(Character key:tmap.keySet())
        {
            for(int i=1;i<=tmap.get(key);i++)
            {
                sb.append(key);
            }
        }
        return sb.toString();
    }
}