class LRUCache {
    Map<Integer, Node> cache;
    int size = 0;
    int capacity;
    Node head;
    Node tail;
    class Node{
        int val;
        int key;
        Node next;
        Node prev;

        public Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        size = 0;
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }
    public void addToHead(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
    public void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public Node removeLRU(){
        Node lru = tail.prev;
        removeNode(lru);
        cache.remove(lru.key);
        return lru;
    }
    public int get(int key) {
        if(cache.containsKey(key)){
            removeNode(cache.get(key));
            addToHead(cache.get(key));
            return cache.get(key).val;
        }
        return -1;     
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node temp = cache.get(key);
            removeNode(temp);
            addToHead(temp);
            temp.val = value;
        }
        else{
            Node temp = new Node(key, value);
            addToHead(temp);
            cache.put(key,temp);
            size++;
            if(size > capacity){
                removeLRU();
                size--;
            }
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */