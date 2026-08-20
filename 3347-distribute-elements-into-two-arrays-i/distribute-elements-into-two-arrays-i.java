class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();

        lst.add(nums[0]);
        lst2.add(nums[1]);

        for(int i=2;i<nums.length;i++)
        {
            if(lst.get(lst.size()-1) > lst2.get(lst2.size()-1))
            {
                lst.add(nums[i]);
            }
            else{
                lst2.add(nums[i]);
            }
        }

        int[] result = new int[nums.length];
        int ind = 0;
        for(int i=0;i<lst.size();i++)
        {
            result[ind] = lst.get(i);
            ind++;
        }

        for(int i=0;i<lst2.size();i++)
        {
            result[ind] = lst2.get(i);
            ind++;
        }

        return result;
        
    }
}