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
    public boolean find(TreeNode root, TreeNode lower, TreeNode upper){
        if(root==null){
            return true;
        }
        if(lower!=null && root.val<=lower.val){
            return false;
        }
        if(upper!=null && root.val>=upper.val){
            return false;
        }
        return find(root.left, lower, root) && find(root.right, root, upper);
    }
    public boolean isValidBST(TreeNode root) {
        return find(root,null,null);
    }
}
