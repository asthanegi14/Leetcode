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
    public int find(TreeNode root, int s){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            // System.out.println("root = "+root.val+" s = "+s);
            return Integer.valueOf(s*10+root.val);
        }
        return find(root.left, (s*10 + root.val)) +  find(root.right,(s*10 + root.val));
    }
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        
        return find(root, 0);
    }
}
