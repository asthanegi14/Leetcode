class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int ans=0,sign=1,d=0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                d = 10*d+(int)c-'0';
            }
            if(c=='+'){
                ans += sign*d;
                sign=1;
                d=0;
            }
            if(c=='-'){
                ans += sign*d;
                sign = -1;
                d=0;
            }
            if(c=='('){
                st.push(ans);
                st.push(sign);
                sign = 1;
                ans = 0;
            }
            if(c==')'){
                ans += sign*d;
                d = 0;
                ans*=st.pop();
                ans+=st.pop();
            }
        }
        if(d!=0){
            ans+=d*sign;
        }
        return ans;
    }
}
