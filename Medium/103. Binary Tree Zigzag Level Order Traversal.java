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
        List<List<Integer>> ans = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null){return ans;}

        q.add(root);
        boolean odd = true;

        while(!q.isEmpty()){
            LinkedList<Integer> q2 = new LinkedList<>();
            int size = q.size();

            while(size-->0){
                TreeNode node = q.poll();
                if(odd){
                    q2.add(node.val);
                }
                else{
                    q2.addFirst(node.val);
                }
                if(node.left!=null){q.add(node.left);}
                if(node.right!=null){q.add(node.right);}
            }
            ans.add(q2);
            odd=!odd;
        }
        return ans;
    }
}
