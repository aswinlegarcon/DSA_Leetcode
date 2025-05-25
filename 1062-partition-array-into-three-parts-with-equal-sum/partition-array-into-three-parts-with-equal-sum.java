class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n = arr.length;
        
        int cnt = 0;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
        }

        if(sum%3!=0) return false; 
       
        int avg = sum / 3;
        int sum2 = 0;
        for(int i=0;i<n;i++)
        {
            sum2 += arr[i];
            if(sum2==avg)
            {
                sum2 = 0;
                cnt++;
            }
        }

        if(cnt>=3) return true;
            
        return false;
    }

   
}