class Solution {
    public int minFlipsMonoIncr(String s) {
        int ans=0,flip=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')
                ans = Math.min(ans+1, flip);
            else{
                flip++;
            }
        }
        return ans;
    }
}
