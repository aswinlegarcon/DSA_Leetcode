//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends

// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        if(head==null || head.next==null) return head;
        Node head0 = new Node(-1);
        Node moveHead0 = head0;
        Node head1 = new Node(-1);
        Node moveHead1 = head1;
        Node head2 = new Node(-1);
        Node moveHead2 = head2;
        
        Node temp = head;
        
        while(temp!=null)
        {
            if(temp.data==0)
            {
                moveHead0.next = temp;
                moveHead0 = moveHead0.next;
            }
            else if(temp.data==1)
            {
                moveHead1.next = temp;
                moveHead1 = moveHead1.next;
            }
            else
            {
                moveHead2.next = temp;
                moveHead2 = moveHead2.next;
            }
            temp = temp.next;
        }
        moveHead2.next = null;
        moveHead0.next = (head1.next != null) ? head1.next : head2.next;
        moveHead1.next = head2.next;
        return head0.next;
    }
}



//{ Driver Code Starts.

class GFG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); i++) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }
            head = new Solution().segregate(head);
            printList(head);
        }
    }
}
// } Driver Code Ends