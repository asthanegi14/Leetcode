class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] i:flights){
            adj.get(i[0]).add(new int[]{i[1], i[2]});
        }
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{src, 0});
        
        int[] min = new int[n];
        Arrays.fill(min, Integer.MAX_VALUE);
        int s=0;
        
        while(!q.isEmpty() && s<=k){
            int size = q.size();
            
            while(size-->0){
                int[] poll = q.poll();
                
                for(int[] j:adj.get(poll[0])){
                    int p = j[1], nxt = j[0];
                    if(p+poll[1] >= min[nxt]){continue;}
                    
                    min[nxt] = p+poll[1];
                    q.offer(new int[] {nxt, min[nxt]});
                }
            }
            s++;
        }
        
        return min[dst] == Integer.MAX_VALUE ? -1:min[dst];
    }
}