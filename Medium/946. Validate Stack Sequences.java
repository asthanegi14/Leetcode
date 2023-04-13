class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();

        int i=0, j=0;
        while(i<pushed.length && j<popped.length){
            if(pushed[i]!=popped[j]){
                if(!st.isEmpty() && st.peek()==popped[j]){
                    st.pop();
                    j++;
                }
                else{
                    st.push(pushed[i]);
                    i++;
                }
            }
            else if(pushed[i]==popped[j]){
                j++;i++;
            }
        }
        while(j<popped.length){
            if(st.peek()!=popped[j]){
                return false;
            }
            else{
                st.pop();
                j++;
            }
        }

        return st.isEmpty();
    }
}
