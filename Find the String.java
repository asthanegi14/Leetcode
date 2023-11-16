class Solution{
    public String findString(int n, int k){
       String ans="";
       Set<String> s = new HashSet<>();
       for(int i=0;i<n;i++){
           ans+='0';
       }
       s.add(ans);
       String temp;
       
       for(int i=k-1;i>=0;i--){
           temp = ans.substring(ans.length()-n+1);
           temp += Integer.toString(i);
           
           if(!s.contains(temp)){
               ans += Integer.toString(i);
               i=k;
               s.add(temp);
           }
       }
       return ans;
    }
}
