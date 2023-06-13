class Solution {
    public String smallestString(String s) {
        int i=0, n=s.length();
        char[] c = s.toCharArray();
        
        while(i<n && s.charAt(i)=='a'){
            i++;
        }
        
        if(i==n){
            c[i-1] = 'z';
            return new String(c);
        }
        
        while(i<n && s.charAt(i)!='a'){
            c[i] = (char) (c[i]-1);
            i++;
        }
        return new String(c);
    }
}
