class Solution {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            Node prev = null;

            for(int i=1;i<=size;i++){
                Node curr = q.poll();
                curr.next = prev;
                if(curr.right!=null){
                    q.add(curr.right);
                } 
                
                if(curr.left!=null){
                    q.add(curr.left);
                }
                prev = curr;
            }
        }
        return root;
    }
}
