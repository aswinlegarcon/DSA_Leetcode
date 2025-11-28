class Solution {

    public void combine(int index,int arr[],int target,List<Integer> ds,List<List<Integer>> ans)
    {

        if(target == 0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            if(i > index && arr[i] == arr[i-1]) continue; // leaves for first iteration
            if(arr[i] > target) break;

            ds.add(arr[i]);
            combine(i+1,arr,target-arr[i],ds,ans);
            ds.remove(ds.size()-1);
        }

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        combine(0,candidates,target,ds,ans);
        return ans;
    }
}