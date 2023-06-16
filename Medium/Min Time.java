class Solution {
    public static long[] find(HashMap<Integer, int[]> map, int[] a, int idx, int n){
        int[] arr = map.get(a[idx]);
        int t = arr[2], st = arr[0], e = arr[1];
        if(idx==n-1){
            return new long[]{Math.abs(st)+t, Math.abs(e)+t}; 
        }
        long[] a2 = find(map, a, idx+1, n);
        int nxtS = map.get(a[idx+1])[0], nxtE = map.get(a[idx+1])[1];
        
        long lft = Math.min(Math.abs(nxtE-st)+a2[0], Math.abs(nxtS-st)+a2[1]);
        long rgt = Math.min(Math.abs(nxtE-e)+a2[0], Math.abs(nxtS-e)+a2[1]);
        
        return new long[]{lft+t, rgt+t};
    }
    public static long minTime(int n, int[] locations, int[] types) {
        // code here
        HashMap<Integer, int[]> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int t = types[i], l=locations[i];
            
            if(map.containsKey(t)){
                int[] a = map.get(t);
                a[0]=Math.min(a[0], l);
                a[1]=Math.max(a[1], l);
                a[2]=Math.abs(a[0]-a[1]);
            }
            
            else{
                map.put(t, new int[]{l,l,0});
            }
        }
        
        int size=map.size();
        int[]a=new int[size];
        int i=0;
        
        for(int k:map.keySet()){
            a[i++]=k;
        }
        
        Arrays.sort(a);
        
        long[] ans = find(map, a, 0, size);
        
        int[] arr = map.get(a[0]);
        return Math.min(ans[0]+Math.abs(arr[1]), ans[1]+Math.abs(arr[0]));
    }
}
