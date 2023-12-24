class Solution {
    public int minOperations(String s) {
        int ans=0;
        int x=0, y=0;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(i%2==0 && c=='1'){
                x++;
            }    
            else if(i%2==1 && c=='0'){
                x++;
            }
        }
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(i%2==0 && c=='0'){
                y++;
            }    
            else if(i%2==1 && c=='1'){
                y++;
            }
        }
        ans = Math.min(x, y);
        
        return ans;
    }
}