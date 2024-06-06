class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(hand);
        
        for(int i:hand){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        
        for(int i=0;i<hand.length;i++){
            if(map.get(hand[i])==0){
                continue;
            }
            
            for(int j=0;j<groupSize;j++){
                int ni = hand[i]+j;
                
                if(map.getOrDefault(ni, 0) == 0){
                    return false;
                }
                
                map.put(ni, map.getOrDefault(ni, 0)-1);
            }
        }
        return true;
    }
}