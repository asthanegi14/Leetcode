class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuffer sb = new StringBuffer();
        
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            sb.insert(sb.length(), c);
            if(c==ch){
                sb.reverse();
                return sb.toString()+word.substring(i+1, word.length());
            }
        }
        return word;
    }
}