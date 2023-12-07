class Solution {
    public String largestOddNumber(String num) {
        int i=0, n=num.length();
        String ans="";
        
        while(i<n){
            char c = num.charAt(i);
            if((c-'0')%2!=0){
                ans = num.substring(0, i+1);
            }
            i++;
        }
        return ans;
    }
}