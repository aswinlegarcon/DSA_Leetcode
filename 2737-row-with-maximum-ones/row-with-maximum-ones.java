class Solution {
    private int lowerBound(int[] arr)
    {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length-1;
        int ind = arr.length;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]>=1){
                ind = mid;
                high = mid-1;
            } 
            else {
                low = mid+1;
            }
        }
        return ind;
    }
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = new int[2];
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0;i<mat.length;i++)
        {
            int ind = lowerBound(mat[i]);
            int len = mat[0].length-ind;
            if(len>max)
            {
                max = len;
                index = i;
            }
        }
        ans[0] = index;
        ans[1] = max;
        return ans;

    }
}