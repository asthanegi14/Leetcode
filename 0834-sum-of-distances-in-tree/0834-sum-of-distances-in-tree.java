class Solution {
    public void find(int i, int par, List<List<Integer>> adj, int[] ans, int[] count){
        for(int j:adj.get(i)){
            if(j!=par){
                find(j, i, adj, ans, count);
                count[i] += count[j];
                ans[i] += ans[j]+count[j];
            }
        }
    }
     public void dfs(int i, int par, List<List<Integer>> adj, int[] ans, int[] count){
        for(int j:adj.get(i)){
            if(j!=par){
                ans[j] = ans[i]-count[j]+(count.length-count[j]);
                
                dfs(j, i, adj, ans, count);
            }
        }
     }
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] i:edges){
            adj.get(i[0]).add(i[1]);            
            adj.get(i[1]).add(i[0]);
        }
        int[] ans = new int[n];
        int[] count = new int[n];
        Arrays.fill(count, 1);
        
        find(0, -1, adj, ans, count);
        dfs(0, -1, adj, ans, count);
        
        return ans;
    }
}