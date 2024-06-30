class Solution {
    public void dfs(List<List<Integer>> ans, List<List<Integer>> a, int u, int v){
        for (int i: a.get(v)){
            if(ans.get(i).size() == 0 || ans.get(i).get(ans.get(i).size() - 1) != u) {
                ans.get(i).add(u);
                dfs(ans, a, u, i);
            }
        }
    } 
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> ans = new ArrayList<>();
        List<List<Integer>> a = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
            a.add(new ArrayList<>());
        }
        
        for(int[] i:edges){
            int u = i[0], v = i[1];
            a.get(u).add(v);
        }
        
        for(int i=0;i<n;i++){
            dfs(ans, a, i, i);
        }
        
        return ans; 
    }
}