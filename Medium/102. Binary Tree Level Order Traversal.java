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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        if(root==null){return ans;}

        q.add(root);
        while(q.size()!=0)
        {
            int size = q.size();
            List<Integer> q2 = new LinkedList<>();
            while(size-->0){
                TreeNode n = q.poll();
                q2.add(n.val);

                if(n.left!=null){
                    q.add(n.left);
                }
                if(n.right!=null){
                    q.add(n.right);
                }
            }
            ans.add(q2);
            
        }
        return ans;
    }
}
