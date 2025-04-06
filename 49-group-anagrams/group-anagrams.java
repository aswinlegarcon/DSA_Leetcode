class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {   
        HashMap<String,List<String>> map = new HashMap<>(); // key - sorted string -- value - list of string with same key
        for(String str:strs)
        {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);
            if(map.containsKey(key))
            {
                map.get(key).add(str);
            }
            else
            {
                map.put(key,new ArrayList<>());
                map.get(key).add(str);
            }
        }

        List<List<String>> result = new ArrayList<>(map.values());
        return result;
        
        
    }
}