class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        
        String ans = "";
        int k=2*numRows-2;
        
        for(int i=0;i<numRows;i++){
            for(int j=i;j<s.length();j+=k){
                ans += s.charAt(j);
                
                if(i>=1 && i<=numRows-2 && j+(k-2*i)<s.length()){
                    ans += s.charAt(j+k-2*i);
                }
            }
        }
        
        return ans;
    }
}