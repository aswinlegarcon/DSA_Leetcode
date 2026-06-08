class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        for(int i=0;i<arr1.length;i++)
        {
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }

        for(int i=0;i<arr2.length;i++)
        {
            if(!map.containsKey(arr2[i])) return false;
            map.put(arr2[i],map.get(arr2[i])-1);

        }

        for(Character key:map.keySet())
        {
            if(map.get(key) != 0) return false;
        }
        return true;
    }
}