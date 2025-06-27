class Solution {
    public int reinitializePermutation(int n) {
        int[] perm = new int[n];
        int check[] = new int[n];
        for(int i=0;i<n;i++)
        {
            perm[i] = i;
        }
        check = Arrays.copyOf(perm,n);
        int count = 0;
        int arr[] = new int[n];
        for(int j=1;j<=n;j++)
        {
            count++;
            for(int i=0;i<n;i++)
            {
                if(i%2==0) arr[i] = perm[i/2];
                else if(i%2==1) arr[i] = perm[n/2 + (i-1)/2];
            }
            perm = Arrays.copyOf(arr,n);
            if(Arrays.equals(perm,check))
            {
                return count;
            }
        }
        return count;
    }
}