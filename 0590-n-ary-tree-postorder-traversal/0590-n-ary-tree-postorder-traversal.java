/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public void trav(List<Integer> ans, Node root){
        if(root==null){
            return;
        }
        
        for(Node i:root.children){
            trav(ans, i);   
        }
        
        ans.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        
        trav(ans, root);
        
        return ans;
    }
}