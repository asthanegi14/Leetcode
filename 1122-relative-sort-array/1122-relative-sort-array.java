class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        int j=0;
        int[] ans = new int[arr1.length];
        
        for(int i:arr1){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        for(int i:arr2){
            if(map.containsKey(i)){
                int key = map.get(i);
                
                while(key-->0){
                    ans[j++] = i;
                }
                
                map.remove(i);
            }
        }
        Arrays.sort(arr1);
        
        for(int i:arr1){
            if(map.containsKey(i)){
                ans[j++] = i;
            }
        }
        
        return ans;
    }
}