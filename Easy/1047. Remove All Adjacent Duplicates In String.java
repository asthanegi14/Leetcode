class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);

            if(st.isEmpty()){
                st.push(c);
            }
            else if(st.peek().equals(c)){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        System.out.println("size = "+st.size());
        StringBuffer sb = new StringBuffer();
        while(!st.isEmpty()){
            System.out.println(st.peek());
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}
