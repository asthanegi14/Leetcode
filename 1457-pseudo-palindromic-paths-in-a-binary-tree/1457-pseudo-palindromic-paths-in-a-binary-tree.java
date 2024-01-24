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
    int count=0;
    public void trav(TreeNode root, HashMap<Integer, Integer> map){
        if(root==null){
            return;
        }
        map.put(root.val, map.getOrDefault(root.val, 0)+1);
        
        if(root.left == null && root.right == null){
            if(isValid(map)){
                count++;
            }
        }
        trav(root.left, map);
        trav(root.right, map);
        
        map.put(root.val, map.getOrDefault(root.val, 0)-1);
        if(map.get(root.val)==0){
            map.remove(root.val);
        }
    }
    public boolean isValid(HashMap<Integer, Integer> map){
        int one=0;
        for(int i:map.keySet()){
            if(map.get(i)%2!=0){
                one++;
            }
        }
        return one>1?false:true;
    }
    public int pseudoPalindromicPaths (TreeNode root) {
        trav(root, new HashMap<>());
        return count;
    }
}