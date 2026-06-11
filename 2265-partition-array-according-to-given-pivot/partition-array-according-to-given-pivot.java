class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];

        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            int num = nums[i];
            if(num < pivot) less.add(num);
            else if(num == pivot) equal.add(num);
            else greater.add(num);
        }
        int ind = 0;
        for(int num:less)
        {
            result[ind] = num;
            ind++;
        }

        for(int num:equal)
        {
            result[ind] = num;
            ind++;
        }

        for(int num:greater)
        {
            result[ind] = num;
            ind++;
        }
        
    return result;
    }
}