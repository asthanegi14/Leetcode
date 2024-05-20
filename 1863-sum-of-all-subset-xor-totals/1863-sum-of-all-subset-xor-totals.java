class Solution {
    public int find(int[] nums, int idx, int xor){
        if(idx==nums.length){
            return xor;
        }
        
        int take = find(nums, idx+1, xor^nums[idx]);
        int skip = find(nums, idx+1, xor);
        
        return take+skip;
    }
    public int subsetXORSum(int[] nums) {
        return find(nums, 0, 0);
    }
}