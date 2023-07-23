class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int n1 = st.pop();
                int n2 = st.pop();
                int res = 0;
                if(tokens[i].equals("+")){
                    res = n1+n2;
                }
                if(tokens[i].equals("-")){
                    res = n2-n1;
                }
                if(tokens[i].equals("*")){
                    res = n1*n2;
                }
                if(tokens[i].equals("/")){
                    res = n2/n1;
                }
                // System.out.println("n1 = "+n1+" n2 = "+n2+" res = "+res);
                st.push(res);
            }            
            else{
                st.push(Integer.valueOf(tokens[i]));
            }
        }
        return st.pop();
    }
}
