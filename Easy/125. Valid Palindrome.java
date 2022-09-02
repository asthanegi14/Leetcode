class Solution {
    public boolean isPalindrome(StringBuffer sb,int i,int n){
        if(i<=n){
            if(sb.charAt(i)!=sb.charAt(n)){
                return false;
            }
            return isPalindrome(sb,i+1,n-1);
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        
        for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                sb.append(Character.toLowerCase(c));
            }    
        }
        System.out.println(sb);
        if(isPalindrome(sb,0,sb.length()-1)){
            return true;
        }
        return false;
    }
}
