class Solution {

    public void genCombination(int index,int[] arr,int target,List<Integer> ds,List<List<Integer>> ans)
    {
        if(index == arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(ds)); // adding as a arraylist
            }
            return;
        }
// generate all the possibilities and if any matches then it will be added to result
        if(arr[index] <= target)
        {
            ds.add(arr[index]); // add in ds
            genCombination(index,arr,target-arr[index],ds,ans); // For Pick 
            ds.remove(ds.size()-1); // remove in ds
        }
        genCombination(index+1,arr,target,ds,ans); // For Not Pick
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        genCombination(0,candidates,target,ds,ans);
        return ans;
    }
}