class Solution {
    List<Integer> ans= new ArrayList<>();
    public void dfs(List<List<Integer>> adj, boolean[] vis, int node, int par){
        if(node!=par){
            vis[node] = true;
        }
        for(int l:adj.get(node)){
            if(!vis[l]){
                dfs(adj, vis, l, node);
            }
        }
    }
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int count=0, max=0;
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(List<Integer> l: edges){
            adj.get(l.get(0)).add(l.get(1));
        }
        // System.out.println(adj);
        
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            dfs(adj, vis, i, i);
            // vis[i]=false;
        }

        for(int i=0;i<n;i++){
            if(!vis[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}
