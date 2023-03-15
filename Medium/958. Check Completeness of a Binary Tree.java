
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        boolean isNull = false;
        if(root==null){
            return true;
        }
        q.add(root);
        while(!q.isEmpty()){
            TreeNode num = q.poll();
            if(num==null){
                isNull = true;
            }
            else{
                if(isNull){
                    return false;
                }
                q.add(num.left);
                q.add(num.right);
            }
        }
        return true;
    }
}
