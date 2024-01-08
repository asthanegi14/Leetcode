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
    public int rangeSumBST(TreeNode root, int low, int high) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int ans = 0;
        
        while(!q.isEmpty()){
            TreeNode node = q.peek();
            if(node.val>=low && node.val<=high){
                ans += node.val;
            }
            
            if(node.left != null){
                q.add(node.left);
            }
            if(node.right != null){
                q.add(node.right);
            }
            q.poll();
        }
        
        return ans;
    }
}