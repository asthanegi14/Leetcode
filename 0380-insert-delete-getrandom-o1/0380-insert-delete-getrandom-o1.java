class RandomizedSet {
    Map<Integer, Integer> map;
    List<Integer> l;
    java.util.Random r;
    
    public RandomizedSet() {
        map = new HashMap<>();
        l = new ArrayList<>();
        r = new java.util.Random();
    }
    
    public boolean insert(int val) {
        boolean pre = false;
        if(!map.containsKey(val)){
            pre = true;
            map.put(val, l.size());
            l.add(val);
        }
        return pre;
    }
    
    public boolean remove(int val) {
        boolean con = map.containsKey(val);
        if(!con){
            return false;
        }
        int x = map.get(val);
        map.put(val, map.getOrDefault(val, 0)+1);
        if(x<l.size()-1){
            int y = l.get(l.size()-1);
            l.set(x, y);
            map.put(y, x);
        }
        map.remove(val);
        l.remove(l.size()-1);
        return true;
    }
    
    public int getRandom() {
        return l.get( r.nextInt(l.size()) );
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */