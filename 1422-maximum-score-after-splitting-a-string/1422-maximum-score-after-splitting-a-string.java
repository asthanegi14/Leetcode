class Solution {
    public int maxScore(String s) {
        int z=0, o=0, ans=0;
        int i=0, j=s.length()-1;
        for(i=0;i<=j;i++){
            if(s.charAt(i)-'0'==1){
                o++;
            }
        }
        
        for(i=0;i<j;i++){
            z+=s.charAt(i)-'0'==0?1:0;
            o-=s.charAt(i)-'0'==1?1:0;
        
            ans = Math.max(ans, z+o);
        }
        
        return ans;
    }
}