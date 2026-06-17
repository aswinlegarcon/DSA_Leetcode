class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        for (int size = arr.length; size > 1; size--) {

            int maxIdx = 0;
            for (int i = 1; i < size; i++) {
                if (arr[i] > arr[maxIdx]) {
                    maxIdx = i;
                }
            }

            if (maxIdx == size - 1) continue;

            reverse(arr, maxIdx);
            ans.add(maxIdx + 1);

            reverse(arr, size-1);
            ans.add(size);
        }
        return ans;
    }

    private void reverse(int[] arr,int r)
    {
        int l = 0;
        while(l<r)
        {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}