class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int size=0;
        for(int i:nums){
            size = Math.max(size, map.get(i));
        }
        for(int i=0;i<size;i++){
            ans.add(new ArrayList<>());
        }
        
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            int val = e.getValue();
            int j=0;
            
            while(val-->0){
                ans.get(j).add(e.getKey());
                j++;
            }
            
        }
        return ans;
    }
}