class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int num = nums[i];
            if(map.get(num)==null)
            {
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }
        }
        TreeMap<Integer,Integer> sortedMap = new TreeMap<>((a,b)->{
            int diff = map.get(b) - map.get(a);
            if(diff==0) return a-b;
            return diff;
        });

        sortedMap.putAll(map);
        int[] ans = new int[k];
        int ind=0;
        for(int num:sortedMap.keySet()){
            if(ind==k) break;
            ans[ind] = num;
            ind++;
        }
        return ans;
    }
}