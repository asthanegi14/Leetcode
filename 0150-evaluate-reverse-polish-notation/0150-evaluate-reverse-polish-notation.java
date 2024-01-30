class Solution {
    public boolean isOperator(String s){
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
            return true;
        }
        return false;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String c = tokens[i];
            if(isOperator(c)){
                int a = st.pop();
                int b = st.pop();
                int ans=0;
                
                if(c.equals("-")){
                    ans = b-a;
                }
                if(c.equals("+")){
                    ans = a+b;
                }
                if(c.equals("*")){
                    ans = a*b;
                }
                if(c.equals("/")){
                    ans = b/a;
                }
                st.push(ans);
            }
            else{
                st.push(Integer.valueOf(c));
            }
        }
        return st.pop();
    }
}