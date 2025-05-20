class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length) return false;
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            char c = pattern.charAt(i);
            String sep = arr[i];
            if(map.containsKey(c))
            {
                String toCheck = map.get(c);
                if(!sep.equals(toCheck))
                {
                    return false;
                }
            }
            else
            {
                for(String q : map.values())
                {
                    if(sep.equals(q))
                    {
                        return false;
                    }
                }
                map.put(c,sep);
            }
        }
        return true;
    }
}