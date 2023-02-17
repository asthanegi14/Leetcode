class Solution {
    public int bfs(TreeNode root, ArrayList<Integer> arr){
        if(root==null){
            return 0;
        }
        if(root.left!=null){
            bfs(root.left, arr);
        }
        arr.add(root.val);
        if(root.right!=null){
            bfs(root.right, arr);
        }
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.size();i++){
            min = Math.min(Math.abs(arr.get(i)-arr.get(i-1)), min);
        }
        return min;
    }
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        int ans = bfs(root,arr);
        return ans;
    }
}
