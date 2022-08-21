class Solution {
    public boolean find(String s, String t)
    {
        if(s.length() != t.length()){return false;}
        
        int[] a = new int[256];
        int[] b= new int[256];
        for(int i=0;i<256;i++){
            a[i]=0;
            b[i]=0;
        }
        for(int i=0;i<s.length();i++){
            int x = s.charAt(i);
            int y = t.charAt(i);
            if(a[x] == 0 && b[y] == 0)
            {
                a[x] = (int)t.charAt(i);
                b[y] = (int)s.charAt(i);
            }
            else if(a[x] != (int)t.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public boolean isIsomorphic(String s, String t) {
        
        return find(s,t);
    }
}
