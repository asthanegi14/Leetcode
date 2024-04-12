class Solution {
    public int trap(int[] h) {
        int[] l = new int[h.length];        
        int[] r = new int[h.length];
        int[] min = new int[h.length];
        int n = h.length;
        
        l[0] = h[0];
        for(int i=1;i<n;i++){
            l[i] = Math.max(l[i-1], h[i]);
        }
        
        r[n-1] = h[n-1];
        for(int i=n-2;i>=0;i--){
            r[i] = Math.max(r[i+1], h[i]);
        }
        
        for(int i=0;i<n;i++){
            min[i] = Math.min(l[i], r[i]);
        }
        
        int ans=0;
        for(int i=0;i<n;i++){
            int cal = min[i]-h[i];
            // System.out.println("cal = "+cal);
            if(cal>0){
                ans+=cal;
            }
        }
        
        return ans;
    }
}