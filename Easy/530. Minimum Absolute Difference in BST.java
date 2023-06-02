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
    public int find(TreeNode root, ArrayList<Integer> arr){
        if(root==null){
            return 0;
        }
        if(root.left!=null){
            find(root.left, arr);
        }

        arr.add(root.val);

        if(root.right != null){
            find(root.right, arr);
        }
        int min = Integer.MAX_VALUE;
        for(int i=1;i<arr.size();i++){
            min = Math.min(min, arr.get(i)- arr.get(i-1));
        }
        return min;
    }
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        return find(root, arr);

    }
}
