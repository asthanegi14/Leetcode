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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if(root==null){
            return ans;
        }

        ans.addAll(inorderTraversal(root.left));
        ans.add(root.val);
        ans.addAll(inorderTraversal(root.right));

        return ans;
    }
}




class Solution {
    List<Integer> a = new ArrayList<>();
    public void inorder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        inorderTraversal(root.left);
        a.add(root.val);
        inorderTraversal(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return a;
    }
}
