class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(c=='('){
                st.push(')');
            }
            else if(c=='['){
                st.push(']');
            }
            else if(c=='{'){
                st.push('}');
            }
            else{
                if(st.isEmpty() || st.peek() != c){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        
        return st.isEmpty()?true:false;
    }
}