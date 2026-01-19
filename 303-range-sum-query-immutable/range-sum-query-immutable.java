class NumArray {

    private int[] prefSum;
    public NumArray(int[] nums) {
        int n = nums.length;
        prefSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefSum[i + 1] = prefSum[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return prefSum[right + 1] - prefSum[left];
    }
}