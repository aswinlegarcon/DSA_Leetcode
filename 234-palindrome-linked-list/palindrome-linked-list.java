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

    public ListNode reverseNode(ListNode head)
    {
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null)
        {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;

    }
    public boolean isPalindrome(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
// slow will be in middle
        ListNode newHead = reverseNode(slow.next); // reverse to check palindrome

        ListNode first = head;
        ListNode second = newHead;

        while(second != null)
        {
            if(first.val != second.val)
            {
                reverseNode(newHead); // re reverse to normal as per given in order to return
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseNode(newHead);
        return true;
    }
}