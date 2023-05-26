class Solution {
    public boolean equals(String a, String b){
        if(a==null || a.isEmpty()){
            return true;
        }
        if(!a.startsWith(b)){
            return false;
        }
        return equals(a.substring(b.length()), b);
    }
    public boolean repeatedSubstringPattern(String s) {
        for(int i=1;i<=s.length()/2;i++){
            String p = s.substring(0,i);

            if(equals(s.substring(i), p)){
                return true;
            }
        }
        return false;
    }
}
