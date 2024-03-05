class Solution {
    public int minimumLength(String s) {
        int i=0, j=s.length()-1, ans=0;
        
        while(i<j){
            char x = s.charAt(i), y = s.charAt(j);
            if(x!=y){
                break;
            }
            else{
                while(i<s.length() && s.charAt(i)==x){
                    i++;
                }
                while(j>=0 && s.charAt(j)==y){
                    j--;
                }
            }
            
            // System.out.println("x = "+x+" y = "+y+" i = "+i+" j = "+j);
        }
        return j<i?0:(j-i+1);
    }
}