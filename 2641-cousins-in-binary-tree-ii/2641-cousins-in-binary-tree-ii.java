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
    public TreeNode replaceValueInTree(TreeNode root) {
        if(root==null){
            return null;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int pre = root.val;
        
        while(!q.isEmpty()){
            int size = q.size();
            int lvlSum=0;
            
            for(int i=0;i<size;i++){
                TreeNode pop = q.poll();
                int sum = (pop.left!=null?pop.left.val:0)+(pop.right!=null?pop.right.val:0);
                
                if(pop.left!=null){
                    pop.left.val = sum;
                    q.add(pop.left);
                }
                if(pop.right!=null){
                    pop.right.val = sum;
                    q.add(pop.right);
                }
                
                lvlSum += sum;
                pop.val = pre-pop.val;
            }
            
            pre = lvlSum;
        }
        
        return root;
    }
}