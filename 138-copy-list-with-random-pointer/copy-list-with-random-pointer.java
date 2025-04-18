/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public void insertNode(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            Node newNode = new Node(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }

    } 

    public void connectRandom(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            Node copy = temp.next;
            if(temp.random!=null)
            {
                copy.random = temp.random.next;
            }
            else
            {
                copy.random = null;
            }
            temp = temp.next.next;
        }
    }

    public Node extractList(Node head)
    {
        Node temp = head;
        Node dummy = new Node(-1);
        Node move = dummy;

        while(temp!=null)
        {
            move.next = temp.next;
            temp.next = temp.next.next;
            move = move.next;
            temp = temp.next;
        }
        return dummy.next;
    }
    public Node copyRandomList(Node head) {
        insertNode(head);
        connectRandom(head);
        return extractList(head);

        
    }
}