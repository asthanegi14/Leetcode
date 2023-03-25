class Solution {
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    public int dfs(int node, boolean[] vis, int[] count){
        if(vis[node]){
            return count[0];
        }
        if(!vis[node]){
            vis[node]=true;
            count[0]++;
            for(int i: adj.get(node)){
                if(!vis[i]){
                    dfs(i, vis, count);
                }
            }
        }
        return count[0];
    }
    public long countPairs(int n, int[][] edges) {
        int count=0;
        long ans=((long)n*(n-1))/2;

        if(edges.length==0){
            return ans;
        }

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] i: edges){
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }

        boolean[] vis = new boolean[n];
        for(int k=0;k<n;k++){
            count = dfs(k, vis, new int[1]);
            ans -= ((long)count*(count-1))/2;
        }
        return ans;
    }
}
