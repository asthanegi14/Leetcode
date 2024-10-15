class Solution {
    public long minimumSteps(String s) {
        long ans=0;
        int b=0;
        
        char[] ch = s.toCharArray();
        for(char c: ch){
            if(c-'0'==1){
                b++;
            }else{
                ans+=b;
            }
        }
        
        return ans;
    }
}