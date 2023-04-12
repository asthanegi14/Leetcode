class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] str = path.split("/");

        for(int i=0;i<str.length;i++){
            if(!str[i].equals(".") && !str[i].equals("..") && !str[i].equals("")){
                st.push(str[i]);
            }
            if(str[i].equals("..") && !st.isEmpty()){
                st.pop();
            }
        }
        Stack<String> st2 = new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        String ans="/";
        while(!st2.isEmpty()){
            System.out.println(st2.peek());
            ans+=st2.pop();
            if(!st2.isEmpty()){
                ans+="/";
            }
        }
        return ans;
    }
}
