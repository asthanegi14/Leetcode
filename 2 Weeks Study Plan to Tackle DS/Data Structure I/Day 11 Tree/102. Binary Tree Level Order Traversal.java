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
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null){
            return list;
        }
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> addto = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode mun = q.poll();
                addto.add(mun.val);
                if(mun.left!=null){
                    q.add(mun.left);
                }
                if(mun.right!=null){
                    q.add(mun.right);
                }
            }
            list.add(addto);
        }
        return list;
    }
}
