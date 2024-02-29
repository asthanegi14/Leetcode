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
    public boolean isValid(List<Integer> l, int level) {
        if (level % 2 == 0) {
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i) % 2 == 0 || (i > 0 && l.get(i) <= l.get(i - 1))) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i) % 2 != 0 || (i > 0 && l.get(i) >= l.get(i - 1))) {
                    return false;
                }
            }
        }
        return true;
    }


    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int lvl = 0;
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            
            for(int i=0;i<size;i++){
                TreeNode pop = q.poll();
                l.add(pop.val);
                
                if(pop.left!=null){
                    q.add(pop.left);
                }
                if(pop.right!=null){
                    q.add(pop.right);
                }
            }
            if(!isValid(l, lvl)){
                return false;
            }
            lvl++;
            // System.out.println("lvl="+lvl+" size="+size);
        }
        return true;
    }
}