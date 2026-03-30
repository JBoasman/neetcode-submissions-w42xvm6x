class MyHashMap {
    int[] setInt = new int[1000001];
    
    public MyHashMap() {
        for (int i = 0; i < 1000001; i++) {
            setInt[i] = -1;
        }
    }
    
    public void put(int key, int value) {
        setInt[key] = value;
    }
    
    public int get(int key) {
        return setInt[key];   
    }
    
    public void remove(int key) {
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