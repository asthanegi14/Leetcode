class Solution {
    public int[] sortArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE, n=nums.length, idx=0;
        int[] ans = new int[n];

        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        
        for(int i=min;i<=max;i++){
            while(map.containsKey(i) && map.get(i)>0){
                ans[idx++] = i;
                map.put(i, map.get(i)-1);
            }
        }

        return ans;
    }
}
