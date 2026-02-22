class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int n = nums1.length;
        int m = nums2.length;
        for(int i=0;i<n;i++)
        {
            set1.add(nums1[i]);
        }
        for(int i = 0;i<m;i++)
        {
            set2.add(nums2[i]);
        }

        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for(int num:set1)
        {
            if(set2.contains(num))
            {
                continue;
            }   
            temp.add(num);
        }
        
        lst.add(temp);
        temp = new ArrayList<>();
        for(int num:set2)
        {
            if(set1.contains(num))
            {
                continue;
            }   
            temp.add(num);
        }
        lst.add(temp);

    return lst;
    }
}