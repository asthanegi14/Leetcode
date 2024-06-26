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
    public TreeNode arrToTree(int i, int j, List<Integer> l){
        if(i>j){
            return null;
        }
        
        int mid = (j+i)/2;
        TreeNode node = new TreeNode(l.get(mid));
        node.left = arrToTree(i, mid-1, l);        
        node.right = arrToTree(mid+1, j, l);
        
        return node;
    }
    public void trav(TreeNode root, List<Integer> l){
        if(root==null){
            return;
        }
        
        trav(root.left, l);
        l.add(root.val);
        trav(root.right, l);
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        trav(root, l);
        
        // System.out.println(l);
        
        return arrToTree(0, l.size()-1, l);
    }
}