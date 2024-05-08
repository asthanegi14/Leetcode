class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> score[b]-score[a]);

        String[] ans = new String[score.length];
        
        for(int i=0;i<score.length;i++){
            pq.add(i);
        }
        int i=0;
        
        while(!pq.isEmpty()){
            int idx = pq.poll();
            
            if(i==0){
                ans[idx] = "Gold Medal";
            }
            else if(i==1){
                ans[idx] = "Silver Medal";
            }
            else if(i==2){
                ans[idx] = "Bronze Medal";
            }
            else{
                ans[idx] = Integer.toString(i+1);
            }
            i++;
        }
        
        return ans;
    }
}