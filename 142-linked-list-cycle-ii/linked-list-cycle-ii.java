/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        // find whether it has a loop
        // after finding point the slow = head
        // now move the fast and slow by one until it collides
        // return any one fast||slow that is the starting point
        while(fast!=null && fast.next!=null)
        {
            
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                slow = head;
                while(slow!=fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
        
    }

}