class SnapshotArray {
    HashMap<Integer, Integer>[] map;
    int[] arr;
    int scount;
    
    public SnapshotArray(int length) {
        map = new HashMap[length];
        for(int i=0;i<length;i++){
            map[i] = new HashMap<>();
        }
        scount=0;
    }
    
    public void set(int index, int val) {
        map[index].put(scount, val);
    }
    
    public int snap() {
        scount++;
        return scount-1;
    }
    
    public int get(int index, int snap_id) {
        while(snap_id >= 0 && !map[index].containsKey(snap_id)){
            snap_id--;
        }
        if(snap_id<0){
            return 0;
        }
        return map[index].get(snap_id);
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */
