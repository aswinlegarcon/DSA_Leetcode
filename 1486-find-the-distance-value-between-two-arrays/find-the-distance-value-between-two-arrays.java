class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int cnt = 0;
        for(int i=0;i<arr1.length;i++)
        {
            boolean check = true;
            for(int j=0;j<arr2.length;j++)
            {
                int dist = Math.abs(arr1[i] - arr2[j]);
                if(dist <= d){
                    check = false;
                    break;
                }
            }
            if(check){
                cnt++;
            }
        }
        return cnt;
    }
}