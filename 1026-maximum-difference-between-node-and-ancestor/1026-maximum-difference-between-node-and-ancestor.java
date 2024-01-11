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
    int ans = 0;
    
    public void find(TreeNode node, int min, int max){
        if(node == null){
            return;
        }
        ans = Math.max(ans, Math.max(Math.abs(min-node.val), Math.abs(max-node.val)));
        min = Math.min(min, node.val);
        max = Math.max(max, node.val);
        
        find(node.left, min, max);        
        find(node.right, min, max);
    }
    public int maxAncestorDiff(TreeNode root) {
        if(root==null){
            return 0;
        }
        int min = root.val, max = root.val;
        
        find(root, min, max);
        
        return ans;
    }
}