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
    public void trav(List<Integer> ans, TreeNode root){
        if(root==null){
            return;
        }
        trav(ans, root.left);
        ans.add(root.val);
        trav(ans, root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        trav(ans, root);
//         TreeNode temp = root;

//         while(temp!=null){
//             if(temp.left == null){
//                 ans.add(temp.val);
//                 temp = temp.right;
//             }
//             else{
//                 TreeNode pre = temp.left;
//                 while(pre.right!=null && pre.right!=temp){
//                     pre = pre.right;
//                 }

//                 if(pre.right==null){
//                     pre.right = temp;
//                     temp = temp.left;
//                 }
//                 else{
//                     pre.right = null;
//                     ans.add(temp.val);
//                     temp = temp.right;
//                 }
//             }
//         }
        return ans;
    }
}