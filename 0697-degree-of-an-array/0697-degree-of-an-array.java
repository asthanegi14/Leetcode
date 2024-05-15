class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], new int[]{1, i, i});
            }
            else{
                int[] temp = map.get(nums[i]);
                temp[0]++;
                temp[2] = i;
            }
        }
        
        int deg = Integer.MIN_VALUE, ans = Integer.MAX_VALUE;
        
        for(int[] i:map.values()){
            if(i[0]>deg){
                deg = i[0];
                ans = i[2]-i[1]+1;
            }
            else if(i[0]==deg){
                ans = Math.min(i[2]-i[1]+1, ans);
            }
        }
        
        return ans;
    }
}