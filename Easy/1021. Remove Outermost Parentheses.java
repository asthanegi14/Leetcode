class Solution {
    public String removeOuterParentheses(String s) {
        int count=0,n=0;
        StringBuffer sb = new StringBuffer();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                sb.append(s.substring(n+1,i));
                n=i+1;
            }
        }
        return sb.toString();
    }
}
