class Solution {
    public boolean isPos(String s, int[] map){
        int[] f = new int[26];
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            f[c-'a']++;
            
            if(f[c-'a']>map[c-'a']){
                return false;
            }
        }
        return true;
    }
    public int countCharacters(String[] words, String chars) {
        int[] map = new int[26];
        
        for(int i=0;i<chars.length();i++){
            char c = chars.charAt(i);
            map[c-'a']++;
        }
        
        int ans=0;
        
        for(String s: words){
            if(isPos(s, map)){
                ans += s.length();
            }
        }
        return ans;
    }
}