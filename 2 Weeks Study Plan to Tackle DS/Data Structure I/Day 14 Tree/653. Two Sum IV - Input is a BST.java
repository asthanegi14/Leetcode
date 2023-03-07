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
    public void inorder(TreeNode root, ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        if(root.left!=null){
            inorder(root.left, arr);
        }
        arr.add(root.val);
        if(root.right!=null){
            inorder(root.right, arr);
        }
    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();

        inorder(root, arr);
        int i=0, j=arr.size()-1;
        while(i<j){
            if((arr.get(i) + arr.get(j)) == k){
                return true;
            }
            if((arr.get(i) + arr.get(j)) > k){
                j--;
            }
            if((arr.get(i) + arr.get(j)) < k){
                i++;
            }
        }
        return false;
    }
}
