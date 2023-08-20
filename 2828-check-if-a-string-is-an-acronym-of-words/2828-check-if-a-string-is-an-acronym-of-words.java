class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String ans="";
        for(String str:words){
            ans+=str.charAt(0);
        }
        return ans.equals(s);
    }
}