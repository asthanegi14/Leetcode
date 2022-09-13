class Solution {
    public int maxArea(int[] a) {
        int l=0,r=a.length-1;
        int ans=0;
        
        while(l<r){
            int wid = r-l;
            int h = Math.min(a[l],a[r]);
            
            int area = wid*h;
            ans = Math.max(ans,area);
            
            if(a[l]<a[r]){l++;}
            else if(a[l]>a[r]){r--;}
            else{
                r--;l++;
            }
        }
        return ans;
    }
}
