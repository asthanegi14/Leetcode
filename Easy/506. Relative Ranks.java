class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->score[b]-score[a]);

        for(int i=0;i<score.length;i++){
            pq.add(i);
        }

        String[] ans = new String[score.length];
        int i=1;
        while(!pq.isEmpty()){
            int idx = pq.poll();
            if(i==1){
                ans[idx]="Gold Medal";
            }
            if(i==2){
                ans[idx]="Silver Medal";
            }
            if(i==3){
                ans[idx]="Bronze Medal";
            }
            else if(i>3){
                String s = Integer.toString(i);
                ans[idx] = s;
            }
            i++;
        }

        return ans;

    }
}
