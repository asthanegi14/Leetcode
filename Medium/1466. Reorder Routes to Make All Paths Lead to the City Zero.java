class Solution {
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    ArrayList<ArrayList<Integer>> biAdj = new ArrayList<>();
    int count=0;

    public void dfs(int node, boolean[] vis){
        vis[node]=true;
        for(int i: adj.get(node)){
            if(!vis[i] ){
                count++;
                dfs(i, vis);
            }
        }
        for(int i: biAdj.get(node)){
            if(!vis[i] ){
                dfs(i, vis);
            }
        }
    }
    public int minReorder(int n, int[][] conn) {
        for(int i=0;i<n;i++){
            adj.add( new ArrayList<>());
            biAdj.add( new ArrayList<>());
        }
        for(int i=0;i<conn.length;i++){
            adj.get(conn[i][0]).add(conn[i][1]);
            biAdj.get(conn[i][0]).add(conn[i][1]);
            biAdj.get(conn[i][1]).add(conn[i][0]);
        }

        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,vis);
            }
        }

        return count;
    }
}
