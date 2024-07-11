class Solution {
    int i=0;
    public String reverseParentheses(String s) {
        StringBuffer sb = new StringBuffer();
        
        while(i<s.length()){
            char c = s.charAt(i);
            if(c=='('){
                i++;
                String str = reverseParentheses(s);
                sb.append(str);
            }
            else if(c==')'){
                i++;
                return sb.reverse().toString();
            }
            else{
                i++;
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}