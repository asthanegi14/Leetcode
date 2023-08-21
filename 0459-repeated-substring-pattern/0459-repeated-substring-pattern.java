class Solution {
    public boolean equal(String a, String b){
        if(a==null || a.isEmpty()){
            return true;
        }
        if(!a.startsWith(b)){
            return false;
        }
        return equal(a.substring(b.length()), b);
    }
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        
        for(int i=1;i<=n/2;i++){
            String sub = s.substring(0,i);
            String rest = s.substring(i);
            if(equal(rest, sub)){
                return true;
            }
        }
        return false;
    }
}