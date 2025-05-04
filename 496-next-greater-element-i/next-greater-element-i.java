class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nge[] = new int[nums2.length];
        Stack<Integer> st = new Stack<>(); 
        int n2 = nums2.length;
        for(int i=n2-1;i>=0;i--)
        {
            while(!st.empty() && st.peek() <= nums2[i])
            {
                st.pop();
            }
            if(st.empty()) nge[i] = -1;
            else nge[i] = st.peek();
            st.push(nums2[i]);
        }

        int ans[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums2[j] == nums1[i])
                {
                    ans[i] = nge[j];
                    break;
                }
            }
        }
        return ans;
    }
}