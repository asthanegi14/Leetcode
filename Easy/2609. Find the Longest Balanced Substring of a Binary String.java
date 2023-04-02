class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int ans=0;
        int i=0, j=0, k=0;

        while(i<s.length()){
            int zero=0, one=0;
            j=i;
            while(j<s.length()){
                if(s.charAt(j)=='0'){
                    zero++;
                }
                if(s.charAt(j)=='1'){
                    break;
                }
                j++;
            }
            k=j;
            while(k<s.length()){
                if(s.charAt(k)=='1'){
                    one++;
                }
                if(s.charAt(k)=='0'){
                    break;
                }
                if(zero==one){
                    ans = Math.max(ans, k-i+1);
                }
                k++;
            }
            i++;
        }
        return ans;
    }
}
