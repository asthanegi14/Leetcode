class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null || k<=0){
            return new int[0];
        }

        int n=nums.length;
        int[] ans = new int[n-k+1];
        int x=0;
        Deque<Integer> q = new ArrayDeque<>();

        for(int i=0;i<nums.length;i++){
            while(!q.isEmpty() && q.peek()<i-k+1){
                q.poll();
            }

            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }

            q.add(i);
            if(i>=k-1){
                ans[x++]=nums[q.peek()];
            }
        }
        return ans;
    }
}