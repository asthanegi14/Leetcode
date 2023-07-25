class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        boolean lev = true;
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            // System.out.println("lev = "+lev+" size="+size);
            ArrayList<Integer> a = new ArrayList<>();
            
            for(int i=0;i<size;i++){
                Node pop = q.poll();
                a.add(pop.data);
                
                if(pop.left!=null){
                    q.add(pop.left);
                }
                if(pop.right!=null){
                    q.add(pop.right);
                }
            }
            if(!lev){
               for(int i=0;i<a.size();i++){
                   arr.add(a.get(i));
               }
            }
            else{
                for(int i=a.size()-1;i>=0;i--){
                   arr.add(a.get(i));
               }
            }
            
            lev=!lev;
        }
        
        return arr;
    }
}
