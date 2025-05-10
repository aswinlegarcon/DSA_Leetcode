class Solution {
    public int largestRectangleArea(int[] arr) {
        int max = 0;
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.empty() && arr[st.peek()] > arr[i]) // we go next smaller
            {
                int num = st.pop();
                int nse = i;
                int pse = st.empty()?-1:st.peek();
                max = Math.max(max,arr[num]*(nse-pse-1)); 
            }
            st.push(i);
        }

        while(!st.empty())
        {
            int num = st.pop();
            int nse = n;
            int pse = st.empty()?-1:st.peek();
            max = Math.max(max,arr[num]*(nse-pse-1));
        }
        return max;
        
    }
}