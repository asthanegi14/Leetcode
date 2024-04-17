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
    public void find(TreeNode root, StringBuffer sb, StringBuffer ans){
        if(root==null){
            return;
        }
        sb.append((char) (root.val+'a'));
        
        if(root.left==null && root.right==null){
            String rev = sb.reverse().toString();
            if(ans.length()==0 || rev.compareTo(ans.toString())<0){
                ans.setLength(0);
                ans.append(rev);
            }
            
            sb.reverse();
        }
        
        find(root.left, sb, ans);        
        find(root.right, sb, ans);
        
        sb.setLength(sb.length()-1);
    }
    public String smallestFromLeaf(TreeNode root) {
        StringBuffer ans = new StringBuffer();
        
        find(root, new StringBuffer(), ans);
        
        return ans.toString();
    }
}