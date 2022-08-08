class Solution {
    public int characterReplacement(String s, int k) {
        int[] ans = new int[26];
        int i=0,max=0,x=0,res=0;
        while(i<s.length()){
            ans[s.charAt(i)-'A']++;
            
            for(int j=0;j<26;j++){
                max = Math.max(ans[j],max);
            }
            
            if((i-x-max+1)<=k){
                res = i-x+1;
            }
            else{
                char c = s.charAt(x);
                ans[c-'A']--;
                x++;
            }
            i++;
        }
        return res;
    }
}
