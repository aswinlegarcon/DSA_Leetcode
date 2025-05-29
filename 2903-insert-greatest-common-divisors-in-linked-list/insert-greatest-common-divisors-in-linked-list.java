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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp.next!=null)
        {
            ListNode one = temp;
            ListNode two = temp.next;
            int gcd = gcd(one.val,two.val);
            ListNode node = new ListNode(gcd);
            one.next = node;
            node.next = two;
            temp = temp.next.next;
        }
        
        return head;
    }

    public int gcd(int a,int b)
    {
        while(a>0 && b>0)
        {
            if(a>b)
            {
                a = a%b;
            }
            else
            {
                b=b%a;
            }
        }
        if(a<=0) return b;
        return a;
        
    }
}