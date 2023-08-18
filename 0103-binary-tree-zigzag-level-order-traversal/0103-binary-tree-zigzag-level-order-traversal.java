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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null){
            return ans;
        }
        boolean lvl = false;
        
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> a = new ArrayList<>();
            
            for(int i=0;i<size;i++){
                TreeNode poll = q.poll();
                a.add(poll.val);
                
                if(poll.left!=null){
                    q.add(poll.left);
                }
                if(poll.right!=null){
                    q.add(poll.right);
                }
            }
            lvl = !lvl;
            if(lvl){
                ans.add(a);
            }
            else{
                Collections.reverse(a);
                ans.add(a);
            }
        }
        return ans;
    }
}