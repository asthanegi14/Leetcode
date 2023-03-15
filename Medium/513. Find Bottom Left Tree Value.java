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
    public int findBottomLeftValue(TreeNode root) {
        int[] levelNum = new int[2];
        levelNum[0] = 0;
        levelNum[1] = root.val;
        int level=0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            level++;
            for(int i=0;i<size;i++){
                TreeNode pop = q.poll();
                if(pop.left!=null){
                    if(levelNum[0]<level){
                        levelNum[0] = level;
                        levelNum[1] = pop.left.val;
                    }
                    q.add(pop.left);
                }
                if(pop.right!=null){
                    q.add(pop.right);
                }
                if(pop.left==null && pop.right!=null){
                    levelNum[0] = level;
                    levelNum[1] = pop.right.val;
                }
            }
        }
        return levelNum[1];
    }
}
