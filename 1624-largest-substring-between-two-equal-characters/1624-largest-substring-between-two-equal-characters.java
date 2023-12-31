class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int i=0, n=s.length();
        int ans=-1;
        
        while(i<n){
            char c = s.charAt(i);
            int j=n-1;
            boolean found=false;
            while(j>i && s.charAt(j)!=c){
                j--;
            }
            if(s.charAt(j)==c && i!=j){
            // System.out.println("i="+i+" j="+j);
                if(j-i>1){
                    ans = Math.max(ans, j-i-1); 
                }
                else{
                    ans = Math.max(ans, 0); 
                }
            }
            i++;
        }
        return ans;
    }
}