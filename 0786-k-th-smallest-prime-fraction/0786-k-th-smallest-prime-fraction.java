class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                int x = arr[a[0]] * arr[b[1]];                
                int y = arr[b[0]] * arr[a[1]];
                
                return x-y;
            }
        });
        
        for(int i=0;i<arr.length;i++){
            pq.add(new int[]{i, arr.length-1});
        }
        while(k-->1){
            int[] pop = pq.poll();
            
            if(pop[1]-1>pop[0]){
                pop[1]--;
                pq.add(pop);
            }
        }
        int[] pop = pq.poll();
        
        return new int[]{arr[pop[0]], arr[pop[1]]};
    }
}