class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<heights.length-1;i++){
            if(heights[i]>=heights[i+1]){
                continue;
            }
            bricks -= heights[i+1] - heights[i];
            pq.add(heights[i+1]-heights[i]);
            
            if(bricks<0){
                bricks += pq.poll();
                if(ladders>0){
                    ladders--;
                }
                else{
                    return i;
                }
            }
        }
        
        return heights.length-1;
    }
}