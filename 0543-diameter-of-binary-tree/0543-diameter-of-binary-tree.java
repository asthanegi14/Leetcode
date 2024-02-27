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
    int ans=0;
    public int find(TreeNode root){
        if(root==null){
            return 0;
        }
        int l = find(root.left);        
        int r = find(root.right);
        
        ans = Math.max(ans, l+r);
        // System.out.println(l+" "+r);
        
        return 1+Math.max(l, r);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        find(root);
        return ans;
    }
}