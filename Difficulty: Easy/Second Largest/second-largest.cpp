class Solution {
  public:
    int getSecondLargest(vector<int> &arr) {
        // code here
        int max = -1;
        int secMax = -1;
        int n = arr.size();
        for(int i=0;i<n;i++)
        {
            int temp = arr[i];
            if(temp>max)
            {
                secMax = max;
                max = temp;
            }
            else if(temp>secMax && temp < max)
            {
                secMax = temp;
            }
        }
        return secMax;
        
    }
};