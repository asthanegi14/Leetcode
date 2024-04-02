class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] a = new int[256];
        int[] b = new int[256];
        
        for(int i=0;i<s.length();i++){
            int x = (int)s.charAt(i);            
            int y = (int)t.charAt(i);
            
            if(a[x]!=0){
                if(a[x] != t.charAt(i)){
                    return false;
                }
            }
            if(b[y]!=0){
                if(b[y] != s.charAt(i)){
                    return false;
                }
            }
            a[x] = t.charAt(i);
            b[y] = s.charAt(i);
        }
        
        return true;
    }
}