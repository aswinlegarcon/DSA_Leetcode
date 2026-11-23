class ProductOfNumbers {
    List<Integer> lst = new ArrayList<>();
    public ProductOfNumbers() {}
    
    public void add(int num) {
        lst.add(num);
    }
    public int getProduct(int k) {
        int n = lst.size(), prod = 1;
        for (int i = n - k; i < n; i++)
            prod *= lst.get(i);
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */