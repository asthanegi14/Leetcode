class Solution {
    public int minScore(int n, int[][] roads) {
        int min = Integer.MAX_VALUE;
        List<int[]>[] arr = new ArrayList[n+1];

        for(int i=0;i<=n;i++){
            arr[i] = new ArrayList<>();
        }
        for(int[] r: roads){
            arr[r[0]].add(new int[]{r[1],r[2]});
            arr[r[1]].add(new int[]{r[0],r[2]});
        }
        
        Set<Integer> vis = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        vis.add(1);

        while(!q.isEmpty()){
            int num = q.poll();
            for(int[] i : arr[num]){
                min = Math.min(min,i[1]);
                if(vis.add(i[0])){
                    q.add(i[0]);
                }
            }
        }
        return min;
    }
}
