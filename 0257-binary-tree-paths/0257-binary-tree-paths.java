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
    public void dfs(TreeNode root, List<String> ans, String s){
        if(root==null){
            return;
        }
        
        if(root.left == null && root.right == null){
            ans.add(s+"->"+root.val);
        }
        s+="->"+root.val;
        dfs(root.left, ans, s);        
        dfs(root.right, ans, s);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        dfs(root, ans, "");
        
        for(int i=0;i<ans.size();i++){
            ans.set(i, ans.get(i).substring(2));
        }
        return ans;
    }
}