class Solution {
  public:
    vector<int> minAnd2ndMin(vector<int> &arr) {
        // code here
        int min = INT_MAX;
        int secMin = INT_MAX;
        int n = arr.size();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                secMin = min;
                min = arr[i];
            }
            else if(arr[i]<secMin && arr[i]>min)
            {
                secMin = arr[i];
            }
        }
        if(secMin==INT_MAX) return {-1};
        return {min,secMin};
    }
};