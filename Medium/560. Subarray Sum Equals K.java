class Solution {
    public int subarraySum(int[] nums, int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count=0,currSum=0;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            // if(currSum==n){
            //     count++;
            // }
            if(map.containsKey(currSum-n)){
                count+=map.get(currSum-n);
            }
            map.put(currSum,map.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}
