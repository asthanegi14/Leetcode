class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        int i=0;
        
        while(i<s.length()){
            char a = s.charAt(i);

            if(!st.isEmpty() && (st.peek()-'a' == a-'A' || st.peek()-'A' == a-'a')){
                i++;
                st.pop();
                continue;
            }
            
            st.push(a);
            i++;
        }
        
        StringBuffer sb = new StringBuffer();
        while(!st.isEmpty()){
            sb.insert(0, st.pop());
        }
        
        return sb.toString();
    }
}