class KthLargest {
    int k;
    PriorityQueue<Integer> pq;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<Math.min(k, nums.length);i++){
            a.add(nums[i]);
        }
        pq = new PriorityQueue<>();
        pq.addAll(a);

        for(int i=k;i<nums.length;i++){
            pq.add(nums[i]);
            pq.poll();
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>k){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
