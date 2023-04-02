class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int n = 0;
        for(int i:nums){
            n = Math.max(n, map.get(i));
        }

        for(int i=0;i<n;i++){
            arr.add(new ArrayList<>());
        }
        int k=0;
        
        for(Map.Entry<Integer, Integer> set: map.entrySet()){
            int key = set.getKey();
            int value = set.getValue();

            while(value-->0){
                arr.get(k).add(key);
                k++;
            }
            k=0;
        }
        return arr;
    }
}
