class Solution {
    public int maxLevelSum(TreeNode root) {
        int maxSum=Integer.MIN_VALUE, l=1, ans=0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;

            for(int i=0;i<size;i++){
                TreeNode pop = q.poll();
                sum+=pop.val;
                if(pop.left!=null){
                    q.add(pop.left);
                }
                if(pop.right!=null){
                    q.add(pop.right);
                }
            }
            if(sum>maxSum){
                maxSum = sum;
                ans = l;
            }
            l++;
        }
        return ans;
    }
}
