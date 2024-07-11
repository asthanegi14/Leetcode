class Solution {
    // int i=0;
    public String reverseParentheses(String s) {
//         StringBuffer sb = new StringBuffer();
        
//         while(i<s.length()){
//             char c = s.charAt(i);
//             if(c=='('){
//                 i++;
//                 String str = reverseParentheses(s);
//                 sb.append(str);
//             }
//             else if(c==')'){
//                 i++;
//                 return sb.reverse().toString();
//             }
//             else{
//                 i++;
//                 sb.append(c);
//             }
//         }
        
//         return sb.toString();
        
        Stack<Integer> st = new Stack<>();
        StringBuffer sb = new StringBuffer();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                st.add(sb.length());
            }
            else if(c==')'){
                int idx = st.pop();
                String sub = new StringBuffer(sb.substring(idx)).reverse().toString();
                sb.replace(idx, sb.length(), sub);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}