class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i:nums){
            pq.add(i);
        }
        
        long ans=0;
        
        
        for(int i=0;i<k;i++){
            int num =  pq.poll();
            ans += num;
            
            pq.add((int)Math.ceil((double)num/3));
        }
        
        return ans;
    }
}