class Solution {
    class Pair{
        char c;
        int count;

        Pair(char c, int count){
            this.c = c;
            this.count = count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            // int n=k;
            if(st.isEmpty() || st.peek().c != c){
                st.push(new Pair(c, 1));
            }
            else{
                Pair n = st.pop();
                st.push(new Pair(n.c, (n.count+1)));
            }
            if(st.peek().count == k){
                st.pop();
            }
            // System.out.println(map);
            // if(!st.isEmpty()){
            //     System.out.println(st.peek().c+", "+st.peek().count);
            // }
        }
        StringBuffer ans = new StringBuffer();
        while(!st.isEmpty()){
            Pair p = st.pop();
            while(p.count-->0){
                ans.append(p.c);
            }
        }
        return ans.reverse().toString();
    }
}
