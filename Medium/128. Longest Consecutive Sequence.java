class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        Stack<Integer> st = new Stack<>();

        if(nums.length==1){
            return 1;
        }
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(st.isEmpty()){
                st.push(nums[i]);
            }
            if(st.peek()<nums[i] && Math.abs(nums[i]-st.peek())==1){
                st.push(nums[i]);
            }
            if(Math.abs(nums[i]-st.peek())>1){
                while(!st.isEmpty()){
                    st.pop();
                }
                st.push(nums[i]);
            }
            ans = Math.max(ans,st.size());
        }
        return ans;
    }
}
