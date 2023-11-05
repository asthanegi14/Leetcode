class Solution {
    public int[] topK(int[] nums, int k) {
        // Code here
        
        int[] ans = new int[k];
        int j=0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (map.get(a)==map.get(b))?b-a:map.get(b)-map.get(a));
        
        for(int e: map.keySet()){
            pq.add(e);
        }
        
        while(!pq.isEmpty() && j<k){
            ans[j++] = pq.poll();
        }
        
        return ans;
    }
}
