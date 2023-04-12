class Solution {
    public int balancedStringSplit(String s) {
        int r=0, l=0, ans=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='R'){
                r++;
            }
            if(c=='L'){
                l++;
            }

            if(l==r){
                ans++;
                l=0;
                r=0;
            }
        }
        return ans;
    }
}
