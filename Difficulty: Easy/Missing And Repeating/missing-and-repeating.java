//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; // Import ArrayList
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            // Get the result as an ArrayList<Integer>
            ArrayList<Integer> ans = new Solution().findTwoElement(arr);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java


// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        int hashh[] = new int[n+1]; // number will be 1 - n so we dont use 0
        for(int i=0;i<n;i++)
        {
           hashh[arr[i]]++;
        }
        int missing = 0;
        int secElement = 0;
        for(int i=1;i<=n;i++)
        {
           if(hashh[i] == 2) secElement = i;
           else if(hashh[i] == 0) missing = i;
        }
    
        ArrayList<Integer> result = new ArrayList<>();
            result.add(secElement);
        result.add(missing);
        return result;
    
    }
}
