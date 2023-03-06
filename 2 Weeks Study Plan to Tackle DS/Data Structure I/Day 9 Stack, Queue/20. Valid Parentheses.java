class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length()<=1){
            return false;
        }
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
            else if(st.isEmpty() || st.pop()!=c){
                return false;
            }
        }
        return st.isEmpty();
    }
}
