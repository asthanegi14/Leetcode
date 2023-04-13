class Solution {
    public int minimumMoves(String s) {
        char[] ch = s.toCharArray();
        boolean pres = false;
        int ans=0, i=0;

        while(i<s.length()){
            if(ch[i]=='X'){
               ans++;
               i+=3;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}
