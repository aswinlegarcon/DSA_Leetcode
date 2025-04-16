/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode getKNode(ListNode head,int k)
    {
        k = k-1;
        while(head!=null && k>0)
        {
            k--;
            head = head.next;
        }
        return head;
    }

    public ListNode reverse(ListNode head) {
        ListNode temp = head;  
        ListNode prev = null;  
       
       while(temp != null){  
           ListNode front = temp.next;  
           temp.next = prev;  
           prev = temp;  
           temp = front; 
       }
       return prev;  
    }

    public ListNode reverseKGroup(ListNode head, int k) 
    {
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null)
        {
            ListNode kNode = getKNode(temp,k);
            if(kNode == null)
            {
                if(prev!=null) prev.next = temp;
                break;
            }
            ListNode nextNode = kNode.next;
            kNode.next = null;
            reverse(temp);
            if(temp==head)
            {
                head = kNode;
            }
            else
            {
                prev.next = kNode;
            }
            prev = temp;
            temp = nextNode;

        }
        return head;
    }
}