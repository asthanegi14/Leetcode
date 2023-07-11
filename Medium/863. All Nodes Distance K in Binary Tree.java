/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, TreeNode> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode pop = q.poll();

                if(pop.left!=null){
                    map.put(pop.left.val, pop);
                    q.add(pop.left);
                }
                if(pop.right!=null){
                    map.put(pop.right.val, pop);
                    q.add(pop.right);
                }
            }
        }

        Map<Integer, Integer> vis = new HashMap<>();
        q.add(target);
        while(k>0 && !q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                TreeNode pop = q.poll();
                vis.put(pop.val, 1);

                if(pop.left!=null && !vis.containsKey(pop.left.val)){
                    q.add(pop.left);
                }
                if(pop.right!=null && !vis.containsKey(pop.right.val)){
                    q.add(pop.right);
                }
                if(map.containsKey(pop.val) && !vis.containsKey(map.get(pop.val).val)){
                    q.add(map.get(pop.val));
                }
            }
            // System.out.println(vis);
            k--;
        }
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
        return ans;
    }
}
