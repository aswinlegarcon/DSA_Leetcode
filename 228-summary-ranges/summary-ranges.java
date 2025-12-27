class Solution {

    public List<String> summaryRanges(int[] nums) {

        if(nums.length==0) return new ArrayList<>();
        if(nums.length==1)
        {
            return new ArrayList<>(Arrays.asList(String.valueOf(nums[0])));
        }
        List<String> ans = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]+1 != nums[i+1])
            {
                String temp = String.valueOf(nums[i]);
                ans.add(temp);
            }
            else
            {
                String temp = String.valueOf(nums[i]) + "->";
                int index = i+1;
                while(index<nums.length-1)
                {
                    if(nums[index]+1 != nums[index+1])
                    {
                        break;
                    }
                    index++;
                }
                i = index;
                temp += nums[index];
                ans.add(temp);
            }
        }
        
         if(nums[nums.length-1] != nums[nums.length-2]+1) 
            {
                String temp = String.valueOf(nums[nums.length-1]);
                ans.add(temp);
            }
        return ans;

    }

}