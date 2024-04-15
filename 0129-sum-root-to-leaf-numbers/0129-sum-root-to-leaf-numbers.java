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
    int sum=0;
    public void find(TreeNode root, StringBuffer sb){
        // System.out.println("sum = "+sum+ " sb = "+sb+" root = "+(root==null?-1:root.val));
        if(root == null){
            // if(sb.length()>0){
            //     sum += Integer.parseInt(sb.toString());
            // }
            return;
        }
        
        sb.append(root.val);
        
        find(root.left, sb);
        find(root.right, sb);
        
        if(root.left == null && root.right == null && sb.length()>0){
            sum += Integer.parseInt(sb.toString());
        }
        
        sb.deleteCharAt(sb.length()-1);
    }
    public int sumNumbers(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        
        find(root, sb);
        return sum;
    }
}