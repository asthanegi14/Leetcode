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
    public TreeNode create(TreeNode head, TreeNode pre)
    {
        if(head==null){return pre;}
        
        TreeNode right = create(head.right,pre);
        TreeNode left = create(head.left,right);
        
        head.right=left;
        head.left=null;
        return head;
    }
    public void flatten(TreeNode root) {
        create(root,null);
    }
}
