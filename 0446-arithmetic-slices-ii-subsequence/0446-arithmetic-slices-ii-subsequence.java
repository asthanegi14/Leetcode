class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        int ans=0;
        
        HashMap<Integer, Integer>[] map = new HashMap[n];
        
        for(int i=0;i<n;i++){
            map[i] = new HashMap<>();
        }
        
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                long diff = (long) nums[i]-nums[j];
                if(diff>Integer.MAX_VALUE || diff<Integer.MIN_VALUE){
                    continue;
                }
                int num = (int)diff;
                
                map[i].put(num, map[i].getOrDefault(num, 0)+1);
                if(map[j].containsKey(num)){
                // System.out.println("con = "+map[i].containsKey(num)+" val = "+map[i].get((int)diff));
                    map[i].put(num, map[i].get(num) + map[j].get(num));
                    ans+=map[j].get(num);
                }
            }
        }
        
        return ans;
    }
}