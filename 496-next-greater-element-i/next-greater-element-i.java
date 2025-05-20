class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nge[] = new int[nums1.length];
        HashMap<Integer,Integer> numAndInd = new HashMap<>();
        for(int i=0;i<nums2.length;i++)
        {
            numAndInd.put(nums2[i],i);
        }
        for(int i=0;i<nums1.length;i++)
        {
            boolean yes = false;
            int num = nums1[i];
            int index = numAndInd.get(num);
            for(int j=index;j<nums2.length;j++)
            {
                if(nums2[j] > num)
                {
                    yes = true;
                    nge[i] = nums2[j];
                    break;
                }
            }
            if(!yes)
            {
                nge[i] = -1;
            }
        }
        return nge;
    }
}