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
    class Pair{
        TreeNode node;
        int val;
        Pair(TreeNode node, int val){
            this.node = node;
            this.val = val;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Deque<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root,0));
        int maxAns = 0;
        while(!q.isEmpty()){
            int size = q.size();
            maxAns = Math.max(maxAns, q.getLast().val - q.getFirst().val+1);
            while(size-->0){
                Pair poll = q.poll();
                TreeNode n = poll.node;
                int idx = poll.val;


                if(n.left!=null){
                    q.add(new Pair(n.left, 2*idx));
                }
                if(n.right!=null){
                    q.add(new Pair(n.right, 2*idx+1));
                }
            }
        }

        return maxAns;
    }
}
