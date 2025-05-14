class Node{
    int key;
    int val;
    Node next;
    Node prev;

    Node(int key,int val)
    {
        this.key = key;
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
class LRUCache {
    HashMap<Integer,Node> map;
    int size;
    Node head;
    Node tail;
    
    public LRUCache(int capacity) {
        map = new HashMap<>();
        size = capacity;
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node toGet = map.get(key);
        deleteNode(toGet);
        insertAfterHead(toGet);
        return toGet.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            Node toDel = map.get(key);
            toDel.val = value;
            deleteNode(toDel);
            insertAfterHead(toDel);
        }
        else
        {
            if(map.size()==size)
            {
                
                Node toDel = tail.prev;
                map.remove(toDel.key);
                deleteNode(toDel);
            }
            Node node = new Node(key,value);
            map.put(key,node);
            insertAfterHead(node);
            
        }
    }

    public void insertAfterHead(Node node)
    {
        Node temp = head.next;
        head.next = node;
        node.prev = head;
        node.next = temp;
        temp.prev = node;
    }

    public void deleteNode(Node node)
    {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */