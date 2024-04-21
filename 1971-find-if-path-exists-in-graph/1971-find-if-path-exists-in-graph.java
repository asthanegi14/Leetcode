class Solution {
    boolean ans = false;
    public boolean dfs(List<List<Integer>> adj, int s, int d, boolean[] vis){
        if(vis[s]){
            return false;
        }
        if(s==d){
            ans = true;
            return true;
        }
        
        vis[s] = true;
        for(int i:adj.get(s)){
            if(!vis[i]){
                dfs(adj, i, d, vis);
            }
        }
        
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] i:edges){
            adj.get(i[0]).add(i[1]);            
            adj.get(i[1]).add(i[0]);
        }
        
        boolean[] vis = new boolean[n];
        
        dfs(adj, source, destination, vis);
        
        return ans;
    }
}