class LRUCache {

    private HashMap<Integer, Integer> cache;
    private int capacity;
    private int length=0;
    private ArrayList<Integer> removingOrder;

    public LRUCache(int capacity) {
        this.capacity= capacity;
        this.cache = new HashMap<>();
        removingOrder= new ArrayList<>();
    }

    public int get(int key) {
        Integer result = this.cache.get(key);
        if(result==null) return -1;
        removingOrder.remove(Integer.valueOf(key));
        removingOrder.add(key);
        return result;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)){
            cache.put(key,value);
            removingOrder.remove(Integer.valueOf(key));
            removingOrder.add(key);
            return;
        }
        if(length==capacity){
            int removingKey= removingOrder.getFirst();
            cache.remove(removingKey);
            removingOrder.removeFirst();
            length-=1;
        }
    
        cache.put(key,value);
        removingOrder.add(key);
        length+=1;
    }
}
