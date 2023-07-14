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
    ArrayList<Integer> ans = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        if(root==null){
            return root;
        }
        if(root.left!=null){
            increasingBST(root.left);
        }
        ans.add(root.val);
        if(root.right!=null){
            increasingBST(root.right);
        }

        TreeNode node = new TreeNode(-1);
        TreeNode temp = node;
        for(int i=0;i<ans.size();i++){
            temp.right = new TreeNode(ans.get(i));
            temp = temp.right;
        }
        return node.right;
    }
}
