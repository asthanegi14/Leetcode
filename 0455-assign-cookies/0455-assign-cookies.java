class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);        
        Arrays.sort(s);
        
        int i=0, j=0, ans=0, n=g.length, m=s.length;
        while(i<n && j<m){
            if(g[i]<=s[j]){
                ans++;
                i++; j++;
            }
            else if(g[i]>s[j]){
                j++;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}