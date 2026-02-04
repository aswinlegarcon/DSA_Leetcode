class Solution {
    public void duplicateZeros(int[] arr) {

        int zeros = 0;

        for (int x : arr)
            if (x == 0) zeros++;

        int ind = arr.length - 1;
        int next = arr.length + zeros - 1;

        while (ind >= 0) {

            if (next < arr.length)
                arr[next] = arr[ind];

            if (arr[ind] == 0) {
                next--;
                if (next < arr.length)
                    arr[next] = 0;
            }

            ind--;
            next--;
        }
    }
}
