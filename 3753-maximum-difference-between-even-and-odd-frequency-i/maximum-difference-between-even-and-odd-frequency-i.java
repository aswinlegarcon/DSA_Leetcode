class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])==null) 
            {
                map.put(arr[i],1);
            }
            else 
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }

        int max = Integer.MIN_VALUE;
        for(var temp:map.keySet())
        {
            int cnt = map.get(temp);
            boolean isOdd = cnt%2==0?false:true;
            for(var temp2:map.keySet())
            {
                int cnt2 = map.get(temp2);
                if(isOdd)
                {
                    if(cnt2%2==0)
                    {
                        max = Math.max(max,cnt-cnt2);
                    }
                }
            }
        }
        return max;
    }
}