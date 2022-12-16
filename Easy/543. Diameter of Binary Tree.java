class Solution {
    public int count(TreeNode root,int[] d){
        if(root==null){
            return 0;
        }
        int lh = count(root.left,d);
        int rh = count(root.right,d);
        d[0] = Math.max(d[0],lh+rh);

        return 1+Math.max(lh,rh);
    } 
    public int diameterOfBinaryTree(TreeNode root) {
        int d []= new int[1];
        count(root,d);

        return d[0];
    }
}
