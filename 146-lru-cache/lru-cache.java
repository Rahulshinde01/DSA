class LRUCache {
    private HashMap<Integer, Integer> map; // maintain the key value pair
    private LinkedHashSet<Integer> recentUsage; // maintain the recent used linkedhashset
    private int capacity;

    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        this.recentUsage = new LinkedHashSet<>();
        this.capacity = capacity;
        
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }

       // update the recent used element
        recentUsage.remove(key); 
        recentUsage.add(key);  
        return map.get(key);
    }
    
    public void put(int key, int value) {

        if(map.containsKey(key)){
            recentUsage.remove(key); // modify the entity as given in parameter
            
        }
        else if(map.size() == capacity){ // if capacity full then remove the least used
            int recentElement = recentUsage.iterator().next(); // gives first element of linkedhashset
            recentUsage.remove(recentElement);
            map.remove(recentElement);
        }

        // adding in map and linkedhashset
        recentUsage.add(key);
        map.put(key, value);
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */