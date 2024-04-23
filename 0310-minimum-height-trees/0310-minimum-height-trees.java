class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        
        if(n==1){
            ans.add(0);
        }
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] i:edges){
            adj.get(i[0]).add(i[1]);            
            adj.get(i[1]).add(i[0]);
        }
        
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(adj.get(i).size()==1){
                ans.add(i);
            }
        }
        
        while(n>2){
            n -= ans.size();
            List<Integer> nl = new ArrayList<>();
            
            for(int j: ans){
                int nxt = adj.get(j).get(0);
                adj.get(nxt).remove(Integer.valueOf(j));
                
                if(adj.get(nxt).size()==1){
                    nl.add(nxt);
                }
            }
            
            ans = nl;
        }
        
        return ans;
    }
}