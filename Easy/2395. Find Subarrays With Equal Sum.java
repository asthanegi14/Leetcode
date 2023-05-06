class Solution {
    public boolean findSubarrays(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0, j=i+1;
        while(i<j && j<nums.length){
            int sum = nums[i]+nums[j];
            if(map.containsKey(sum)){
                return true;
            }
            else{
                map.put(sum, 0);
            }
            i++;j++;
        }
        return false;
    }
}
