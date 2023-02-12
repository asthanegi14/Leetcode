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
    public void find(List<Integer> ans, TreeNode root, int l){
        if(root==null){
            return;
        }
        if(l==ans.size()){
            ans.add(root.val);
        }

        find(ans,root.right,l+1);
        find(ans,root.left,l+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }

        find(ans,root,0);
        return ans;
    }
}
