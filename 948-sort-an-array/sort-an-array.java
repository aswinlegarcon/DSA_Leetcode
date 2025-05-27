class Solution {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}

    // public void mergeSort(int[] arr,int low,int high)
    // {
    //     if(low==high) return;
    //     int mid = (low+high)/2;
    //     mergeSort(arr,low,mid);
    //     mergeSort(arr,mid+1,high);
    //     merge(arr,low,mid,high);
    // }

    // public void merge(int[] arr,int low,int mid,int high)
    // {
    //     ArrayList<Integer> temp = new ArrayList<>();
    //     int l = low;
    //     int r = mid+1;

    //     while(l<=mid && r<=high)
    //     {
    //         if(arr[l]<arr[r])
    //         {
    //             temp.add(arr[l]);
    //             l++;
    //         } 
    //         else 
    //         {
    //             temp.add(arr[r]);
    //             r++;
    //         }
    //     }

    //     while(l<=mid)
    //     {
    //         temp.add(arr[l]);
    //         l++;
    //     }

    //     while(r<=high)
    //     {
    //         temp.add(arr[r]);
    //         r++;
    //     }
    //     int index = 0;
    //     for(int i=low;i<=high;i++)
    //     {
    //         arr[i] = temp.get(index);
    //         index++;
    //     }

//     }
// }