class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='B' && !st.isEmpty()){
                if(st.peek()=='A'){
                    st.pop();
                continue;
                }
            }
            if(c=='D' && !st.isEmpty()){
                if(st.peek()=='C'){
                    st.pop();
                continue;
                }
            }
            st.push(c);
            // System.out.println(st.peek());
        }
        return st.size();
    }
}
