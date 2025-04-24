class Solution {
    public void subset(int index,int arr[],List<Integer> ds,List<List<Integer>> ans)
    {
        ans.add(new ArrayList<>(ds));
        for(int i=index;i<arr.length;i++)
        {
            if(index!=i && arr[i] == arr[i-1]) continue;
            ds.add(arr[i]);
            subset(i+1,arr,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(nums);
        subset(0,nums,ds,ans);
        return ans;
    }
}