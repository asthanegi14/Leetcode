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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> sums = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            long sum = 0;
            
            for(int i=0;i<size;i++){
                TreeNode poll = q.poll();
                sum+=poll.val;
                
                if(poll.left!=null){
                    q.add(poll.left);
                }
                if(poll.right!=null){
                    q.add(poll.right);
                }
            }
                
            sums.add(sum);
            System.out.println("At level sum is = "+sum);
        }
        
        Collections.sort(sums);
        System.out.println(sums);
        
        int idx = sums.size()-k;
        
        return idx<0?-1:sums.get(idx);
    }
}