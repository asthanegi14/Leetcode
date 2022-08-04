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
        
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        if(root==null){return ans;}
        
        q.add(root);
        
        while(!q.isEmpty()){
            List<Integer> subans = new LinkedList<Integer>();
            int n = q.size();
            
            for(int i=0;i<n;i++){
                TreeNode res = q.poll();
                subans.add(res.val);
                
                if(res.left != null){q.add(res.left);}
                if(res.right != null){q.add(res.right);}
            }
        ans.add(subans);
        }
        return ans;
    }
}
