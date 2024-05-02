class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int ans=Integer.MIN_VALUE;
        for(int i:nums){
            if(i<0 && set.contains(Math.abs(i))){
                ans = Math.max(ans, Math.abs(i));
            }
        }
        
        return ans==Integer.MIN_VALUE?-1:ans;
    }
}