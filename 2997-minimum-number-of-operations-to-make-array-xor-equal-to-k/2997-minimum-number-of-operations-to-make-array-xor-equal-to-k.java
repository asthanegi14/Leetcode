class Solution {
    public int minOperations(int[] nums, int k) {
        for(int i:nums){
            k^=i;
        }
        
        return Integer.bitCount(k);
    }
}