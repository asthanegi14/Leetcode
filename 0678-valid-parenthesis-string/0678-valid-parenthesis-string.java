class Solution {
    public boolean checkValidString(String s) {
        int o=0, c=0;
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                o++;
                c++;
            }
            else if(ch==')'){
                o--;
                c--;
            }
            else{
                o++; 
                c--;
            }
            if(o<0){
                return false;
            }   
            
            c = Math.max(c, 0);
        }
        
        return c==0;
    }
}