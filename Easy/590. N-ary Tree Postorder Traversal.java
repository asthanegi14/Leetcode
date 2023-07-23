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
    void postOrder(Node root, List<Integer> a){
        for(Node n: root.children){
            postOrder(n, a);
        }
        a.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer> a = new ArrayList<>();
        if(root==null){
            return a;
        }

        postOrder(root, a);
        return a;
    }
}
