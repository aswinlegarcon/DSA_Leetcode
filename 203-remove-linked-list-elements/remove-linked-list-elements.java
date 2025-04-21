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
    public ListNode removeElements(ListNode head, int val) {

        if(head==null || head.next==null) 
        {
            if(head != null && head.next==null && head.val== val) 
            {
                return null;
            }
            else
            {
                return head;
            }
        }
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode res = dummy;
        while(res.next!=null)
        {
            if(res.next.val == val)
            {
                res.next = res.next.next;
            
            }
            else
            {
                res = res.next;
            }
        }
        return dummy.next;
    }
}