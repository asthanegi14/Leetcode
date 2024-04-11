class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> s = new Stack<>();
        
        for(int i=0;i<num.length();i++){
            int n = num.charAt(i)-'0';

            if(!s.isEmpty() && s.peek()>n){
                while(!s.isEmpty() && s.peek()>n && k>0){
                    s.pop();
                    k--;
                }
            }
            s.push(n);
        }
        while(k>0){
            s.pop();
            k--;
        }
        
        StringBuffer sb = new StringBuffer();
        while(!s.isEmpty()){
            sb.insert(0, s.pop());
        }
        
        if(sb.length()==0){
            return "0";
        }
        
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        
        
        return sb.toString();
    }
}