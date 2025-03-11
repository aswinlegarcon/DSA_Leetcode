class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> number = new TreeSet<>();
        for(int num:nums)
        {
           number.add(num);
        }
        int i = 0;
        for(int key:number)
        {
            nums[i] = key;
            i++;
        }
      
        return number.size();
    }
}