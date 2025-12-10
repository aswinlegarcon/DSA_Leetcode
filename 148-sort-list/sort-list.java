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

    public ListNode findMid(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head.next; // in order to get mid1 in case of even
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode mergeList(ListNode head1,ListNode head2)
    {

        ListNode t1 = head1;
        ListNode t2 = head2;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(t1!=null && t2!=null)
        {
            if(t1.val < t2.val)
            {
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }
            else
            {
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }

        if(t1!=null) 
        {
            temp.next = t1;
        }
        else if(t2!=null)
        {
            temp.next = t2;
        }

        return dummy.next;
    }

    public ListNode sortList(ListNode head) 
    {

    //    merge sort
        if(head==null || head.next==null) return head;
        ListNode mid = findMid(head);
        ListNode leftHead = head;
        ListNode rightHead = mid.next;
        mid.next = null;
        leftHead = sortList(leftHead); // left part by making mid.next = null
        rightHead = sortList(rightHead); // right part by making head as mid.next
        return mergeList(leftHead,rightHead); // sort both left and right part

    }
    
}