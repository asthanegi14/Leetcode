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
    public void convert(TreeNode root, int[] nums, int i, int n)
    {
        if(i>n){return;}
        
        int mid = i+(n-i)/2;
        if(nums[mid]<root.val){
            root.left = new TreeNode(nums[mid]);
            convert(root.left,nums,i,mid-1);
            convert(root.left,nums,mid+1,n);
        }
        else if(nums[mid]>root.val)
        {
            root.right = new TreeNode(nums[mid]);
            convert(root.right,nums,i,mid-1);
            convert(root.right,nums,mid+1,n);
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int i=0,n=nums.length;
        int mid = i+(n-i)/2;
        TreeNode root = new TreeNode(nums[mid]);
        
        convert(root,nums,0,mid-1); 
        convert(root,nums,mid+1,nums.length-1);
        
        return root;
    }
}
