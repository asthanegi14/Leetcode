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
    public boolean find(TreeNode left, TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null && right!=null){
            return false;
        }
        if(left!=null && right==null){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        return find(left.left, right.right) && find(left.right, right.left);
    }
    public boolean isSymmetric(TreeNode root) {
       if(root==null){
            return true;
       }
       return find(root.left, root.right);
    }
}
