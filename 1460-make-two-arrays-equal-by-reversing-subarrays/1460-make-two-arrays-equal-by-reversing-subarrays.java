class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        for(int i:target){
            if(!map.containsKey(i)){
                return false;
            }
            else{
                map.put(i, map.getOrDefault(i, 0)-1);
                if(map.get(i)==0){
                    map.remove(i);
                }
            }
        }
        
        return true;
    }
}