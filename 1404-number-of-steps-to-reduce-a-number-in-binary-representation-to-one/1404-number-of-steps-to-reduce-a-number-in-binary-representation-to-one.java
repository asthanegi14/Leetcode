class Solution {
    public int numSteps(String s) {
        int ans=0, c=0;
        for(int i=s.length()-1;i>0;i--){
            ans++;
            if(s.charAt(i)-'0'+c==1){
                ans++;
                c=1;
            }
        }
        
        return ans+c;
    }
}