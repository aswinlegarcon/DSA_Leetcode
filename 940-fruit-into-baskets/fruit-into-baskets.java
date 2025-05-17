class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int l = 0;
        int r = 0;
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r<n)
        {
            int num = fruits[r];
            if(map.containsKey(num))
            {
                map.put(num,map.get(num)+1);
            }
            else
            {
                map.put(num,1);
            }

            while(map.size()>2)
            {
                num = fruits[l];
                map.put(num,map.get(num)-1);
                if(map.get(num)==0)
                {
                    map.remove(num);
                }
                l++;
            }
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}