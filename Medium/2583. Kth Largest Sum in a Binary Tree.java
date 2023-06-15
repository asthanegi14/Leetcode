class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        ArrayList<Long> arr = new ArrayList<>();
        long maxSum = Integer.MIN_VALUE;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            long sum=0;

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
            arr.add(sum);
        }
        Collections.sort(arr);
        Collections.reverse(arr);
        
        return arr.size()<k?-1:arr.get(k-1);
    }
}
