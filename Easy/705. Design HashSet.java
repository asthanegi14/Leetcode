class MyHashSet {
    ArrayList<Integer> arr;
    public MyHashSet() {
        arr = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!arr.contains(key)){
            arr.add(key);
        }
        // System.out.println(arr);
    }
    
    public void remove(int key) {
        if(arr.contains(key)){
            arr.remove(Integer.valueOf(key));
        }
        // System.out.println(arr);
    }
    
    public boolean contains(int key) {
        // System.out.println(arr.contains(key));
        return arr.contains(key);
    }
}
