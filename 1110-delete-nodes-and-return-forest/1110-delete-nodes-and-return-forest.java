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
    public TreeNode find(TreeNode root, boolean r, List<TreeNode> ans, Set<Integer> set){
        if(root==null){
            return null;
        }
        
        boolean d = set.contains(root.val);
        if(r && !d){
            ans.add(root);
        }
        
        root.left = find(root.left, d, ans, set);
        root.right = find(root.right, d, ans, set);
        
        return d?null:root;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> set = new HashSet<>();
        for(int i:to_delete){
            set.add(i);
        }
        List<TreeNode> ans = new ArrayList<>();
        
        find(root, true, ans, set);
        
        return ans;
    }
}