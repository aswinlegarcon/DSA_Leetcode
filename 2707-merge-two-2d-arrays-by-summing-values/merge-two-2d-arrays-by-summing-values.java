import java.util.*;
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
       Map<Integer,Integer> idAndValues = new TreeMap<>();
        
        for(int i=0;i<nums1.length;i++)
        {
            
            if(idAndValues.containsKey(nums1[i][0]))
            {
                int value = idAndValues.get(nums1[i][0]);
                idAndValues.put(nums1[i][0],nums1[i][1]+value);
            }
            else
            {
                 idAndValues.put(nums1[i][0],nums1[i][1]);
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            
             if(idAndValues.containsKey(nums2[i][0]))
            {
                int value = idAndValues.get(nums2[i][0]);
                idAndValues.put(nums2[i][0],nums2[i][1]+value);
            }
            else
            {
                 idAndValues.put(nums2[i][0],nums2[i][1]);
            }
        }
        int [][] result = new int[idAndValues.size()][2];
        
            int i =0;
            for(var keys : idAndValues.entrySet())
            {
                result[i][0] = keys.getKey();
                result[i][1] = keys.getValue();
                i++;
            }
            return result;
            
        
    }
}