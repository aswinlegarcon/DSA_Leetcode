class Solution {
    public int beautySum(String s) {
        int count = 0;
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j=i;j<n;j++)
            {
                char input = s.charAt(j);
                map.put(input,map.getOrDefault(input,0)+1);
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for(Character key:map.keySet())
                {
                    min = Math.min(min,map.get(key));
                    max = Math.max(max,map.get(key));
                }
                count += max - min;
            }
            
            
        }
        return count;
    }
}