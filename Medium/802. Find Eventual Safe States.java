class Solution {
    public boolean dfs(List<List<Integer>> adj, int i, boolean[] vis, boolean[] a){
        vis[i] = true;
        a[i] = true;

        for(int x: adj.get(i)){
            if(!vis[x] && dfs(adj, x, vis, a)){
                return true;
            }
            else if(a[x]){
                return true;
            }
        }
        a[i] = false;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> adj = new ArrayList<>();
        int x=0;

        for(int i=0;i<graph.length;i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<graph[i].length;j++){
                l.add(graph[i][j]);
            }
            adj.add(l);
        }
        boolean[] vis = new boolean[graph.length];
        boolean[] a = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                dfs(adj, i, vis, a);
            }
        }
        for(int i=0;i<a.length;i++){
            if(!a[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}
