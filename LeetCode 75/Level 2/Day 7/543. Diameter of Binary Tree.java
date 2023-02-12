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
    public int find(TreeNode root, int[] ans){
        if(root==null){
            return 0;
        }
        int l = find(root.left, ans);
        int r = find(root.right, ans);

        ans[0] = Math.max(l+r, ans[0]);
        return 1+Math.max(l,r);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] ans = new int[1];
        find(root,ans);
        return ans[0];
    }
}
