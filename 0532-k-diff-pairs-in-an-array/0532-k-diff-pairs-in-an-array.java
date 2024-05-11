class Solution {
    public int findPairs(int[] nums, int k) {

        //TC: O(n^2)

        int n = nums.length;
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i!=j){
        //             ArrayList<Integer> a = new ArrayList<Integer>();
        //             if(nums[i]<nums[j]){
        //                 a.add(nums[i]);
        //                 a.add(nums[j]);
        //             }
        //             else{
        //                 a.add(nums[j]);
        //                 a.add(nums[i]);
        //             }
        //             if(Math.abs(nums[i]-nums[j])==k && !map.containsKey(a)){
        //                 count++;
        //                 map.put(a, 0);
        //             }
        //         }
        //     }
        // }
        // return count;

        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        for(int i:map.keySet()){
            if(k==0){
                if(map.get(i)>=2){
                    count++;
                }
            }
            else{
                if(map.containsKey(i+k)){
                    count++;
                }
            }
        }
        
        
        return count;
    }
}