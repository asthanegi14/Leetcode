class BrowserHistory {
    ArrayList<String> arr;
    int ttl=0, curr=0;

    public BrowserHistory(String homepage) {
        arr = new ArrayList<>();
        arr.add(homepage);
        ttl++;
        curr++;
    }
    
    public void visit(String url) {
        if(curr<arr.size()){
            arr.set(curr, url);
        }
        else{
            arr.add(url);
        }
        curr++;
        ttl = curr;
    }
    
    public String back(int steps) {
        curr = Math.max(1, curr-steps);
        return arr.get(curr-1);
    }
    
    public String forward(int steps) {
        curr = Math.min(ttl, steps+curr);
        return arr.get(curr-1);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
