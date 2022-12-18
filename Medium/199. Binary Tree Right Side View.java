class Solution {
    public void find(TreeNode root, int level, List<Integer>ans){
        if(root==null){
            return;
        }
        if(level==ans.size()){
            ans.add(root.val);
        }

        find(root.right, level+1, ans);
        find(root.left, level+1, ans);

    }
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<Integer>();
        if(root==null){
            return ans;
        }
        
        find(root, 0, ans);
        return ans;
    }
}
