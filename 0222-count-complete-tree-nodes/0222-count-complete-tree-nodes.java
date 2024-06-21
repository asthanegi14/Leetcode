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
    public int findL(TreeNode node, int count){
        return node==null?count-1:findL(node.left, count+1);
    }
    public int find(TreeNode root, int idx){
        if(root.left==null && root.right==null){
            return idx;
        }
        if(findL(root.left, 1) == findL(root.right, 1)){
            return find(root.right, idx*2+1);
        }
        
        return find(root.left, idx*2);
    }
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0; 
        }
        return find(root, 1);
    }
}