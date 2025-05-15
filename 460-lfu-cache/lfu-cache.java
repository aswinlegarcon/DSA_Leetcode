class Node 
{
    int key;
    int val;
    int freq;
    Node next;
    Node prev;
    Node(int key,int val)
    {
        this.key = key;
        this.val = val;
        freq = 1;
    }
}

class DoublyLinkedList
{
    Node head;
    Node tail;
    int size;

    DoublyLinkedList()
    {
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    void add(Node node)
    {
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
        size++;
    }

    void remove(Node node)
    {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
        size--;
    }

    Node removeLast()
    {
        if(size==0) return null;
        Node temp = tail.prev;
        remove(temp);
        return temp;
    }

    boolean isEmpty()
    {
        if(size==0) return true;
        return false;
    }
}

class LFUCache {
    HashMap<Integer,Node> keyMap;
    HashMap<Integer,DoublyLinkedList> freqMap;
    int minFreq;
    int size; 
    public LFUCache(int capacity) {
        this.size = capacity;
        this.minFreq = 0;
        this.keyMap = new HashMap<>();
        this.freqMap = new HashMap<>();
    }
    
    public int get(int key) {
        if(!keyMap.containsKey(key))
        {
            return -1;
        }
        Node node = keyMap.get(key);
        updateFrequency(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(keyMap.containsKey(key))
        {
            Node node = keyMap.get(key);
            node.val = value;
            updateFrequency(node);
        }
        else
        {
            if(keyMap.size() == size)
            {
                Node nodeToDel = freqMap.get(minFreq).removeLast();
                keyMap.remove(nodeToDel.key);
            }
            Node newNode = new Node(key,value);
            keyMap.put(key,newNode);
            minFreq = 1;
            if(!freqMap.containsKey(minFreq))
            {
                freqMap.put(1,new DoublyLinkedList());
            }
            freqMap.get(1).add(newNode);
        }


    }

    public void updateFrequency(Node node)
    {
        int oldFreq = node.freq;
        DoublyLinkedList db = freqMap.get(oldFreq);
        db.remove(node);

        if(oldFreq == minFreq && db.isEmpty())
        {
            minFreq++;
        }
        node.freq++;
        if(!freqMap.containsKey(node.freq))
        {
            freqMap.put(node.freq,new DoublyLinkedList());
        }
        freqMap.get(node.freq).add(node);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */