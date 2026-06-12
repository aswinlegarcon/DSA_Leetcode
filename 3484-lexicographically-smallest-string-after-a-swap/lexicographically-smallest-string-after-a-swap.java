class Solution {
    public String getSmallestString(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            int d1 = arr[i] - '0';
            int d2 = arr[i + 1] - '0';

            if ((d1 % 2 == d2 % 2) && arr[i] > arr[i + 1]) {
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                return new String(arr);
            }
        }

        return s;
    }
}