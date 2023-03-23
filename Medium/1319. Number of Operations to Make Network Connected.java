class Solution {
    ArrayList<ArrayList<Integer>> map = new ArrayList<>();
    public void DFS(int node, boolean[] vis){
        if(vis[node]){
            return;
        }
        vis[node]=true;
        for(int n: map.get(node)){ 
            if(!vis[n]){
                DFS(n, vis);
            }
        }
    }
    public int makeConnected(int n, int[][] conn) {
        boolean[] vis = new boolean[n];
        if(conn.length<n-1){
            return -1;
        }
        
        for(int i=0;i<n;i++){
            map.add(new ArrayList<>());
        }
        for(int i=0;i<conn.length;i++){
            map.get(conn[i][0]).add(conn[i][1]);
            map.get(conn[i][1]).add(conn[i][0]);
        }
        int count=0;

        for(int i=0;i<n;i++){
            if(!vis[i]){
                DFS(i, vis);
                count++;
            }
        }
        return count-1;
    }
}
