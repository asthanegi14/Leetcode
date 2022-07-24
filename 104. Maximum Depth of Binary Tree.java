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
    public int find(TreeNode root)
    {
        int depth=0;
        if(root == null){return 0;}
        int l = find(root.left);
        int r = find(root.right);
        
        depth = Math.max(l,r);
        depth+=1;
        return depth;
    }
    public int maxDepth(TreeNode root) {
        return(find(root));
    }
}
