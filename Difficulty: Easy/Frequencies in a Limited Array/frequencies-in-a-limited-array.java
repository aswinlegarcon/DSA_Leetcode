//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length]; // Creating integer array from the input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            List<Integer> result = new Solution().frequencyCount(arr);

            // Printing the result in the required format
            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (int i = 0; i < result.size(); i++) {
                    if (i != 0) System.out.print(" ");
                    System.out.print(result.get(i));
                }
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        int n = arr.length;
        Map<Integer,Integer> numberAndCount = new TreeMap<>();
        for(int i=1;i<=n;i++)
        {
             numberAndCount.put(i,0);
        }
        for(int num:arr)
        {
            if(numberAndCount.containsKey(num))
            {
                numberAndCount.put(num, numberAndCount.get(num) + 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
             result.add(numberAndCount.get(i));
        }
        return result;
        
        
        
    }
}
