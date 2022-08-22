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
    public boolean find(TreeNode root, Integer l, Integer r){
        if(root==null){return true;}
        if(l!=null && l >= root.val){
            return false;
        }
        if(r!=null && r <= root.val){
            return false;
        }
        return find(root.left, l, root.val) && find(root.right, root.val, r);
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null){return true;}
        return find(root,null,null);
    }
}
