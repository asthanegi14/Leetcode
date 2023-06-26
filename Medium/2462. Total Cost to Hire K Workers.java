class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int i=0, j=costs.length-1;
        PriorityQueue<Integer> a = new PriorityQueue<>(); 
        PriorityQueue<Integer> b = new PriorityQueue<>(); 

        long ans=0;
        while(k-->0){
            while(a.size()<candidates && i<=j){
                a.add(costs[i++]);
            }

            while(b.size()<candidates && i<=j){
                b.add(costs[j--]);
            }
            int x = Integer.MAX_VALUE;
            int y = Integer.MAX_VALUE;

            if(a.size()>0){
                x = a.peek();
            }
            if(b.size()>0){
                y = b.peek();
            }

            if(x<=y){
                ans+=x;
                a.poll();
            }
            else{
                ans+=y;
                b.poll();
            }
        }
        return ans;
    }
}
