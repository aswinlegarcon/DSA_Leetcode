//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends




// User function Template for Java
class Solution {
    
    ArrayList<Long>  result= new ArrayList<>();
    
    ArrayList<Long> factorialNumbers(long n) 
    {
        helpFact(n,1,1);
        return result;
    }
    
    public void helpFact(long n,long i,long fact) {
        if(fact>n)
        {
            return;
        }
        result.add(fact);
        fact = fact*(i+1);
        helpFact(n,i+1,fact);
    }
    
    
}