class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        nums[0]=nums[0]%k;
        for(int i=1;i<nums.length;i++){
            nums[i]=(nums[i-1]+nums[i]%k)%k;
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0],0);
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==0){
                return true;
            }
            if(map.containsKey((nums[i]-k+k)%k)){
                if(i-map.get((nums[i]-k+k)%k) >1){
                    return true;
                }
            }
            else{
                map.put(nums[i],i);
            }
        }

        return false;
    }
}