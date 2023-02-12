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
    public void join(TreeNode root, int start, int end, int[] nums){

        if(start>end){
            return;
        }
        int mid = (start+end)/2;
        System.out.println(mid);
        if(nums[mid]<root.val){
            root.left = new TreeNode(nums[mid]);
            join(root.left, start, mid-1, nums);
            join(root.left, mid+1, end, nums);
        }
        else{
            root.right = new TreeNode(nums[mid]);
            join(root.right, start, mid-1, nums);
            join(root.right, mid+1, end, nums);
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int i=0, n=nums.length;
        int mid=(n+i)/2;

        TreeNode root = new TreeNode(nums[mid]);

        join(root, i, mid-1, nums);
        join(root, mid+1, n-1, nums);

        return root;
    }
}
