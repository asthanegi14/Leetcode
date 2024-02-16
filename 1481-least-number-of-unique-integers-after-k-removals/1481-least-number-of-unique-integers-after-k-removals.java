class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        
        // System.out.println(list);
        
        for (int i = 0; i < list.size(); i++) {
            int key = list.get(i).getKey();
            int val = list.get(i).getValue();
            
            if (k > 0) {
                k -= val;
                if (k >= 0) {
                    list.remove(i);
                    i--;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        
        // System.out.println(list);
        return list.size();
    }
}
