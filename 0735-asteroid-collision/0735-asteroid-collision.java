class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st = new Stack<>();
        int i=0, n=a.length;
        
        while(i<n){
            if(a[i]<0){
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(a[i])){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()>0 && st.peek()==Math.abs(a[i])){
                    st.pop();
                }
                else if(st.isEmpty() || st.peek()<0){
                    st.push(a[i]);
                }
            }
            else{
                st.push(a[i]);
            }
            i++;
        }
        int[] ans = new int[st.size()];
        i=ans.length-1;
        while(!st.isEmpty()){
            ans[i--] = st.pop();
        }
        
        return ans;
    }
}