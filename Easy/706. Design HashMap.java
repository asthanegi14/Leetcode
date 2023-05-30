class MyHashMap {
    int[] arr;
    public MyHashMap() {
        arr = new int[1000001];
        Arrays.fill(arr, -1);
    }
    
    public void put(int key, int value) {
        arr[key] = value;
    }
    
    public int get(int key) {
        return arr[key];
    }
    
    public void remove(int key) {
        arr[key]=-1;
    }
}
