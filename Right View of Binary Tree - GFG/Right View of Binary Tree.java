class Solution{
    //Function to return list containing elements of right view of binary tree.
    
    void traverse(ArrayList<Integer> ans, Node node){
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty()){
            int size = q.size();
            int last = 0;
            
            for(int i=0;i<size;i++){
                Node pop = q.poll();
                last = pop.data;
                
                if(pop.left != null){
                    q.add(pop.left);
                }
                if(pop.right != null){
                    q.add(pop.right);
                }
            }
            ans.add(last);
        }
        
    }
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer> ans = new ArrayList<>();
        traverse(ans, node);
        
        return ans;
    }
}
