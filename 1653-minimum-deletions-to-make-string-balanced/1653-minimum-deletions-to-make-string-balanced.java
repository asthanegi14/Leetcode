class Solution {
    public int minimumDeletions(String s) {
        int count=0, ans=0;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='b'){
                count++;
            }
            else if(count>0){
                count--;
                ans++;
            }
        }
        
        return ans;
    }
}