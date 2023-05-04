class Solution {
    public int findPoisonedDuration(int[] ts, int d) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0;i<ts.length;i++){
        //     int du=d, num=ts[i];
        //     while(du-->0){
        //         if(!map.containsKey(num)){
        //             map.put(num,0);
        //         }
        //         num++;
        //     }
        // }
        // return map.size();
        int s=ts[0], e=ts[0]+d, ans=0;
        for(int i=1;i<ts.length;i++){
            if(ts[i]>e){
                ans+=e-s;
                s=ts[i];
            }
            e=ts[i]+d;
        }
        ans+=e-s;
        return ans;
    }
}
