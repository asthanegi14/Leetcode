class Solution {
    public int find(String s, int k, int i, char ch, Integer[][] a){
        if(i<0 || i>=s.length()){
            return 0;
        }
        if(a[i][ch]!=null){
            return a[i][ch];
        }
        
        int take=0;
        
        if(ch=='?' || Math.abs(ch-s.charAt(i)) <= k){
            take = 1+find(s, k, i+1, s.charAt(i), a);
        }
        int skip = find(s, k, i+1, ch, a);
        
        return a[i][ch] = Math.max(take, skip);
    }
    public int longestIdealString(String s, int k) {
        Integer[][] a = new Integer[s.length()][123];
        int ans = find(s, k, 0, '?', a);
        
        return ans;
    }
}