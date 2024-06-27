class Solution {
    public int findCenter(int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<=edges.length;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] i:edges){
            adj.get(i[0]-1).add(i[1]-1);            
            adj.get(i[1]-1).add(i[0]-1);
        }
        
        for(int i=0;i<adj.size();i++){
            int size = adj.get(i).size();
            if(size==edges.length){
                return i+1; 
            }
        }
        
        return -1;
    }
}