class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String s:arr)
        {
            if(map.containsKey(s))
            {
                map.put(s,map.get(s)+1);
            }
            else
            {
                map.put(s,1);
            }
        }
        int cntK = 0;
        for(String s:arr)
        {
            if(map.get(s)==1) cntK++;
            if(cntK==k) return s;
        }
        return "";

    }
}