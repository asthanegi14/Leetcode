class Solution {
    public void find(List<List<int[]>> adj, int i, int n, int[] dist) {
        Deque<Integer> q = new ArrayDeque<>();
        q.add(i);
        dist[i] = 0;
        
        while (!q.isEmpty()) {
            int u = q.removeFirst();
            for (int[] x : adj.get(u)) {
                int v = x[0];
                int w = x[1];
                
                if (dist[v] > dist[u] + w) {
                    dist[v] = dist[u] + w;
                    q.add(v);
                }
            }
        }    
    } 
    
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        List<List<int[]>> adj = new ArrayList<>();
        int[][] dist = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
            Arrays.fill(dist[i], Integer.MAX_VALUE);
            dist[i][i] = 0;
        }
        
        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            int z = edge[2];
            
            adj.get(x).add(new int[]{y, z});
            adj.get(y).add(new int[]{x, z});
        }
        
        for (int i = 0; i < n; i++) {
            find(adj, i, n, dist[i]);
        }
        
        int ans = -1;
        int minCount = n;
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (dist[i][j] <= distanceThreshold) count++;
            }
            if (count <= minCount) {
                minCount = count;
                ans = i;
            }
        }
        
        return ans;
    }
}
