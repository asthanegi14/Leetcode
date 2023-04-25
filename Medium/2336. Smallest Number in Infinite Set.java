class SmallestInfiniteSet {
    Queue<Integer> q;
    int n;
    public SmallestInfiniteSet() {
        q = new PriorityQueue<>();
        n=1;
    }
    
    public int popSmallest() {
        int curr = n;

        if(!q.isEmpty() && q.peek()<n){
            curr = q.poll();
        }
        else{
            n++;
        }
        while(!q.isEmpty() && q.peek()==curr){
            q.poll();
        }

        return curr;
    }
    
    public void addBack(int num) {
        q.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
