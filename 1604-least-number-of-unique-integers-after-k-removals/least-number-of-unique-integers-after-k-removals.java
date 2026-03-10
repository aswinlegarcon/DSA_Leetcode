class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr)
        {
            if(!map.containsKey(num))
            {
                map.put(num,1);
            }
            else
            {
                map.put(num,map.get(num)+1);
            }
        }

        List<Integer> lst = new ArrayList<>(map.values());

        Collections.sort(lst);
        int cnt = lst.size();
        for(int num:lst)
        {
            if(k>=num)
            {
                k = k-num;
                cnt--;
            }
            else break;
        }

        return cnt;

    }
}