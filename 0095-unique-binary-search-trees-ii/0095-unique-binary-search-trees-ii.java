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
    
    public List<TreeNode> find(int i, int j, List<TreeNode>[][] dp){
        if(i>j){
            List<TreeNode> l = new ArrayList<>();
            l.add(null);
            return l;
        }
        if(dp[i][j] != null){
            return dp[i][j];
        }
        
        List<TreeNode> l = new ArrayList<>();
        for(int k=i;k<=j;k++){
            List<TreeNode> a = find(i, k-1, dp);            
            List<TreeNode> b = find(k+1, j, dp);
            
            for(TreeNode le:a){
                for(TreeNode ri:b){
                    l.add(new TreeNode(k, le, ri));
                }
            }
        }
        return dp[i][j] = l;
    }
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode>[][] dp = new List[n+1][n+1];
        
        return find(1, n, dp);
    }
}