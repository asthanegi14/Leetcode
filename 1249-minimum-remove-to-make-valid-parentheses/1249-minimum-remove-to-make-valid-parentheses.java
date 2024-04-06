class Solution {
    public String minRemoveToMakeValid(String s) {        
        StringBuffer ans = new StringBuffer(s);
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                st.push(i);
                
            }
            else if(c==')'){
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    ans.setCharAt(i, '*');
                }
            }
        }
        
        while(!st.isEmpty()){
            ans.setCharAt(st.pop(), '*');
        }
        String ret = "";
        
        for(int i=0;i<ans.length();i++){
            char c = ans.charAt(i);
            if(c!='*'){
                ret += c;
            }
        }
        
        return ret;
    }
}