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
    boolean ans = false;
    public boolean check(TreeNode a, TreeNode b){
        if(a==null || b==null){
            return (a==b);
        }
        if(a.val!=b.val){
            return false;
        }
        return (check(a.left, b.left) && check(a.right, b.right));
    }
    
    public boolean find(TreeNode root, TreeNode subRoot){
        if(root != null){
             if(root.val == subRoot.val ){
                if(check(root,subRoot)){
                    ans = true; 
                    return true;
                }
            }
        return (find(root.left, subRoot) || find(root.right,subRoot));
        }
        return false;
    }
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        find(root, subRoot);
        
        if(ans){return true;}
        
        else return false;
    }
}
