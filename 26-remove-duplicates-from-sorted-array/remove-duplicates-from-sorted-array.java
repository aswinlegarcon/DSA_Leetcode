class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap<Integer,Integer> numberAndCount = new TreeMap<>();
        for(int num:nums)
        {
            if(numberAndCount.containsKey(num))
            {
                numberAndCount.put(num,numberAndCount.get(num)+1);
            }
            else 
            {
                numberAndCount.put(num,1);
            }
        }
        int i = 0;
        for(int key:numberAndCount.keySet())
        {
            nums[i] = key;
            i++;
        }
      
        return numberAndCount.size();
    }
}