class Solution {
    public boolean isPrefix(String a, String b){
        if(a.startsWith(b)){
            return true;
        }
        
        return false;
    }
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s = sentence.split(" ");
        
        for(int i=0;i<s.length;i++){
            String str = s[i];
            
            if(isPrefix(str, searchWord)){
                return i+1;
            }
        }
        
        return -1;
    }
}