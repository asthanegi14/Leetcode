class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q = new PriorityQueue<>((x,y)->Integer.compare(y,x));
        for(int i=0;i<stones.length;i++){
            q.add(stones[i]);
        }
        // System.out.print("arraylist = "+q+" ");
        while(q.size()>1){
            int a = q.poll();
            int b = q.poll();
            
            if(a!=b){
                q.add(a-b);
            }
        }
        if(q.isEmpty()){return 0;}
        return q.poll();
    }
}
