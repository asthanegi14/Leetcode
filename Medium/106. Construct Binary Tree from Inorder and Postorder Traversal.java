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
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode find(int[] in, int iin, int nin, int[] post, int ipo, int npo){
        if(iin>nin || ipo>npo){
            return null;
        }
        TreeNode root = new TreeNode(post[npo]);
        int position = map.get(post[npo]);
        
        root.left = find(in, iin, position-1, post, ipo, ipo+position-iin-1);
        root.right = find(in, position+1, nin, post, ipo+position-iin, npo-1);

        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }
        return find(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }
}
