class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!st.isEmpty() && c=='*'){
                st.pop();
            }
            if(c!='*'){
                st.push(c);
            }
        }

        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        String ans="";
        while(!st2.isEmpty()){
            ans+=st2.pop();
        }
        return ans;
    }
}
