class Solution {
    int ans=0;
    public void find(TreeNode root, boolean is, int max){
        if(root==null){
            ans = Math.max(max, ans);
            return;
        }

        if(is){
            find(root.right, false, max+1);
            find(root.left, true, 0);
        }
        else{
            find(root.left, true, max+1);
            find(root.right, false, 0);
        }
    }
    public int longestZigZag(TreeNode root) {
        find(root.left, true, 0);
        find(root.right, false, 0);
        return ans;
    }
}
