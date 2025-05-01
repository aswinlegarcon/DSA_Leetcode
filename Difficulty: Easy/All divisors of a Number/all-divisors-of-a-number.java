//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            obj.print_divisors(n);
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=1;i*i<=n;i++) // consider n as 36
        {
            if(n%i==0)
            {
                res.add(i); // 4*12 = 36
                if((n/i)!=i)
                {
                    res.add(n/i); // 36/4 = 12 (instead of 12*4=36)
                }
            }
            
        }
        Collections.sort(res);
        for(int num:res)
        {
            System.out.print(num+" ");
        }
    }
}
