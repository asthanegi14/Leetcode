class Solution {
    public int countStudents(int[] stu, int[] s) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i:stu){
            q.add(i);
        }
        for(int i=s.length-1;i>=0;i--){
            st.add(s[i]);
        }
        
        System.out.println(q);
        int n=stu.length * s.length;
        
        while(n-->0){
            int pop = q.poll();
            if(pop == st.peek()){
                st.pop();
            }
            else{
                q.add(pop);   
            }
            if(q.isEmpty()){
                return 0;
            }
        }
        
        return q.size();
    }
}