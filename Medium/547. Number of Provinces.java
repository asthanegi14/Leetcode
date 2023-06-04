class Solution {
    public void dfs(int i, int[][] conn, boolean[] vis){
        for(int j=0;j<conn.length;j++){
            if(!vis[j] && conn[i][j]==1){
                vis[j] = true;
                dfs(j, conn, vis);
            }
        }
    }
    public int findCircleNum(int[][] conn) {
        int ans=0;
        boolean[] vis = new boolean[conn.length];
        for(int i=0;i<conn.length;i++){
            if(!vis[i]){
                ans++;
                dfs(i, conn, vis);
            }
        }
        return ans;
    }
}
