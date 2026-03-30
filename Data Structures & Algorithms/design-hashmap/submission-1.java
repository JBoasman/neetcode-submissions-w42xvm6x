class MyHashMap {
    boolean[] setBool = new boolean[1000001];
    int[] setInt = new int[1000001];
    
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        setBool[key] = true;
        setInt[key] = value;
    }
    
    public int get(int key) {
        if (!setBool[key]) {
            return -1;
        } else {
            return setInt[key];
        }    
    }
    
    public void remove(int key) {
        setBool[key] = false;
        setInt[key] = -1;
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */