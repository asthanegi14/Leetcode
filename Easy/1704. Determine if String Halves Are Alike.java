class Solution {
    public boolean halvesAreAlike(String s) {
        int acount=0,bcount=0;
        int mid = s.length()/2;
        for(int i=0;i<mid;i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ){
                acount++;
            }
        }
        for(int i=mid;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                bcount++;
            }
        }
        if(acount==bcount){
            return true;
        }
        return false;
    }
}
