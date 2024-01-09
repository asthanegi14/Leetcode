/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void trav(List<Integer> l, TreeNode n){
        if(n==null){
            return;
        }
        
        trav(l, n.left);
        if(n.right==null && n.left == null){
            l.add(n.val);
        }
        trav(l, n.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> a = new ArrayList<>();        
        List<Integer> b = new ArrayList<>();
        
        trav(a, root1);
        trav(b, root2);
        
        System.out.println(a);        
        System.out.println(b);
        return a.equals(b);
    }
}