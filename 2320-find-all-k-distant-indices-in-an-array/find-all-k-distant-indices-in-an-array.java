class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        
        int n = nums.length;
        List<Integer> indexes = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int num = nums[i];
            if(num == key) indexes.add(i);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j:indexes)
            {
                if(Math.abs(i-j) <= k) set.add(i);
            }
        }
        List<Integer> lst = new ArrayList<>(set);
        Collections.sort(lst);
        return lst;
    }
}