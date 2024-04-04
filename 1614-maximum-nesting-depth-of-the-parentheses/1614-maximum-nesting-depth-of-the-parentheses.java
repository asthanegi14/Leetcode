class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int ans=0;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                st.push(c);
            } else if(c==')'){
                ans = Math.max(ans, st.size());
                st.pop();
            }
        }
        
        return ans;
    }
}