class Solution {
    public int appendCharacters(String s, String t) {
        int l1 = s.length(), l2 = t.length(), i=0, j=0;
        
        while(i<l1 && j<l2){
            if(s.charAt(i) == t.charAt(j)){
                j++;
            }
            
            i++;
        }
        
        return l2-j;
    }
}