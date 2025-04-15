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
    public ListNode findLastNode(ListNode head,int k)
    {
        int count = 1;
        ListNode temp = head;
        while(temp!=null)
        {
            if(count == k) return temp;
            count++;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k)
    {
        if(head==null || k==0) return head;
        int length = 1;
        ListNode tail = head;
        while(tail.next!=null)
        {
            length++;
            tail = tail.next;
        }
        k = k%length;
        if(k==0) return head;
        tail.next = head;
        ListNode lastNode = findLastNode(head,length-k);
        head = lastNode.next;
        lastNode.next = null;
        return head;
        
    }
}