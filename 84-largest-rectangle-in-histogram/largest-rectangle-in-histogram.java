class Solution {

    public int[] getNse(int[] arr)
    {
        int nse[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.empty() && arr[st.peek()] >= arr[i])
            {
                st.pop();
            }

            if(st.empty()) nse[i] = arr.length-1;
            else nse[i] = st.peek()-1;
            st.push(i);
        }
        return nse;
    }

    public int[] getPse(int[] arr)
    {
        int pse[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!st.empty() && arr[st.peek()] > arr[i])
            {
                st.pop();
            }

            if(st.empty()) pse[i] = 0;
            else pse[i] = st.peek()+1;
            st.push(i);
        }
        return pse;
    }


    public int largestRectangleArea(int[] arr) {
        int max = 0;
        int n = arr.length;
        int nse[] = getNse(arr);
        int pse[] = getPse(arr);
        for(int i=0;i<n;i++)
        {
            int area = arr[i] * (nse[i]-pse[i]+1);
            max = Math.max(area,max);
        }
        return max;
        
    }
}