class Solution {
    public int titleToNumber(String ct) {
        int ans=0, i=0;
        while(i<ct.length()){
            int m = ct.charAt(i)-'A'+1;
            ans=ans*26+m;
            i++;
        }
        return ans;
    }
}
