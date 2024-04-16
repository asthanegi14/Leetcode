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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode node = new TreeNode(val);
            node.left = root;
            
            return node;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        // TreeNode curr = root;
        // TreeNode last = curr;
        
        for(int i=0;i<depth-2;i++){
            int size=q.size();
            for(int j=0;j<size;j++){
                TreeNode pop = q.poll();
                if(pop.left!=null){
                    q.add(pop.left);
                }
                 if(pop.right!=null){
                    q.add(pop.right);
                }
            }
        }
        
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            TreeNode temp = curr.left;
            curr.left = new TreeNode(val);
            curr.left.left = temp;
            
            temp = curr.right;
            curr.right = new TreeNode(val);
            curr.right.right = temp;
        }
        return root;
    }
}