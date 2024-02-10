class Solution {
    public void findCount(String s, int i, int j, int[] count){
        while((i>=0 && i<s.length()) && (j>=0 && j<s.length()) && (s.charAt(i) == s.charAt(j))){
            i--; j++;
            count[0]++;
        }
    }
    public int countSubstrings(String s) {
        if(s.length()==0){
            return 0;
        }
        int[] count = new int[1];
        
        for(int i=0;i<s.length();i++){
            findCount(s, i, i, count);            
            findCount(s, i, i+1, count);
        }
        
        return count[0];
    }
}