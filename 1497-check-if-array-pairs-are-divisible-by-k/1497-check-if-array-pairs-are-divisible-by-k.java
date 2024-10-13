class Solution {
    public boolean canArrange(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i:arr){
            int rem = i%k;
            if(rem<0){
                rem+=k;
            }
            map.put(rem, map.getOrDefault(rem, 0)+1);
        }
        
        for(int i:map.keySet()){
            if(i==0){
                if(map.get(i)%2!=0){
                    return false;
                }
            }
            
            else if(i*2 == k){
                if(map.get(i)%2!=0){
                    return false;
                }
            }
            
            else{
                int a = map.get(i), b=map.getOrDefault(k-i, 0);

                if(a!=b){
                    return false; 
                }
            }
        }
        
        return true;
    }
}