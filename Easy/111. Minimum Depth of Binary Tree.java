class Solution {
    public int minDepth(TreeNode root) {
        
        if(root==null){
            return 0;
        }

        int l = minDepth(root.left);
        int r = minDepth(root.right);

        return (l==0 || r==0)?1+l+r:1+Math.min(l,r);
    }
}
