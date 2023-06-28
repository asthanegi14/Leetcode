class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        double[] ans = new double[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Double.compare(ans[b],ans[a]));
        List<int[]>[] adj = new ArrayList[n];
        
        for(int i=0;i<n;i++){
            adj[i] = new ArrayList<>();
        }

        for(int i=0;i<edges.length;i++){
            adj[edges[i][0]].add(new int[]{edges[i][1], i});
            adj[edges[i][1]].add(new int[]{edges[i][0], i});
        }

        ans[start] = 1;
        pq.add(start);

        while(!pq.isEmpty()){
            int temp = pq.poll();
            for(int[] i : adj[temp]){
                if(ans[temp]*succProb[i[1]] > ans[i[0]]){
                    ans[i[0]] = ans[temp]*succProb[i[1]];
                    pq.add(i[0]);
                }
            }
        }
        return ans[end];
    }
}
