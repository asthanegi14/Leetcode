class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans=0;
        
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        List<Integer> a = new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            a.add(e.getValue());
        }
        
        for(int i:a){
            if(i==1){
                return -1;
            }
            
            while(i>0){
                if(i%3==0){
                    ans+=i/3;
                    i=0;
                }
                else{
                    ans++;
                    i-=2;
                }
            }
            
            if(i<0){
                return -1;
            }
        }
        return ans;
    }
}