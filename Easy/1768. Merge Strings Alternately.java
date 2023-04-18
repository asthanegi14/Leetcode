class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length(), m=word2.length();
        int i=0, j=0;
        String ans="";
        while(i<n && j<m){
            ans+=word1.charAt(i);
            ans+=word2.charAt(j);
            i++;
            j++;
        }
        while(i<n){
            ans+=word1.charAt(i);
            i++;
        }
        while(j<m){
            ans+=word2.charAt(j);
            j++;
        }
        return ans;
    }
}
