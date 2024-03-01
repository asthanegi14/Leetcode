class Solution {
    public String maximumOddBinaryNumber(String s) {
        int o=0, z=0;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c-'0'==0){
                z++;
            }
            else{
                o++;
            }
        }
        
        // System.out.println("o="+o+" z="+z);
        
        Stack<Character> q = new Stack<>();
        q.add('1');
        o--;
        
        while(z-->0){
            q.add('0');
        }
        while(o-->0){
            q.add('1');
        }
        // System.out.println("q = "+q);
        // StringBuffer ans = new StringBuffer();
        String ans = "";
        
        while(!q.isEmpty()){
            // ans.insert(0, q.poll());
            ans+=q.pop();
        }
        
        return ans;
    }
}