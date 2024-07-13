class Solution {
    public int maximumGain(String s, int x, int y) {
        String ini, rev;
        int min=0, max=0;
        
        if(y>x){
            ini = "ba";
            max = y;
            rev = "ab";
            min = x;
        }
        else{
            ini = "ab";
            max = x;
            rev = "ba";
            min = y;
        }
        
        int ans=0;
        Stack<Character> st = new Stack<>();
        
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && c==ini.charAt(1) && st.peek()==ini.charAt(0)){
                ans += max;
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        
        Stack<Character> st2 = new Stack<>();
        
        while(!st.isEmpty()){
            if(!st2.isEmpty() && st2.peek()==rev.charAt(1) && st.peek()==rev.charAt(0)){
                ans += min;
                st2.pop();
                st.pop();
            }
            else{
                st2.push(st.pop());
            }
        }
        
        return ans;
    }
}