class MyStack {
    Queue<Integer> q;
    
    public MyStack() {
        this.q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);

        int size = q.size();

        while(size-->1){
            q.add(q.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
