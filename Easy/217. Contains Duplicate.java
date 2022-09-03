class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        //TC:O(n*n)
        //SC:O(1)
        
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j] &&i!=j){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
        //TC:O(n)
        //SC:O(n)
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        // System.out.println(map);
        
        for(Map.Entry<Integer,Integer> a: map.entrySet()){
            if(a.getValue()>1){
                return true;
            }
        }
        return false;
    }
}
