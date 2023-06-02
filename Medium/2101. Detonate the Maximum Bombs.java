class Solution {
    public void dfs(List<List<Integer>> adj, int i, boolean[] vis, int[] a){
        vis[i] = true;
        a[0]++;

        for(int j: adj.get(i)){
            if(!vis[j]){
                dfs(adj, j, vis, a);
            }
        }
    }
    public int maximumDetonation(int[][] bombs) {
        List<List<Integer>> adj = new ArrayList<>();
        int n=bombs.length;

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                long x1 = bombs[i][0];
                long y1 = bombs[i][1];
                long r1 = bombs[i][2];
                long x2 = bombs[j][0];
                long y2 = bombs[j][1];

                long dis = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);

                if(dis <= r1*r1){
                    adj.get(i).add(j);
                }
            }
        }

        System.out.println(adj);
        int ans = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            boolean[] vis = new boolean[n];
            int[] a = new int[1];

            dfs(adj, i, vis, a);
            ans = Math.max(ans, a[0]);
        }
        return ans;
    }
}
