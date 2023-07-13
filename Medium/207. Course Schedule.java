class Solution {
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int i, int[] vis){
        // System.out.println("i = "+i+" vis[i] = "+vis[i]);
        if(vis[i]==1){
            return false;
        }
        if(vis[i]==2){
            return true;
        }

        vis[i] = 1;
        for(int j: adj.get(i)){
            if(!dfs(adj, j, vis)){
                return false;
            }
        }

        vis[i] = 2;
        return true;
    }
    public boolean canFinish(int n, int[][] p) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] i: p){
            adj.get(i[0]).add(i[1]);
        }

        int[] vis = new int[n];
        boolean ans = true;
        for(int i=0;i<n;i++){
            if(!dfs(adj, i, vis)){
                return false;
            }
        }
        return true;
    }
}
