class Solution {
        
    
    public boolean checkValid(Map<String,Integer> map,String sub,Integer len){
        
    Map<String,Integer> b = new HashMap<>();
       for(int i=0;i<sub.length();i+=len){
           String w = sub.substring(i,i+len);
           
           // System.out.print("\nw="+w);
           b.put(w,b.getOrDefault(w,0)+1);
           
           
        // System.out.print("\n Map b = "+b);
           if(b.get(w) > map.getOrDefault(w,0)){
               return false;
           }
       }
        return b.equals(map);
    }
    public List<Integer> findSubstring(String s, String[] words) {
        
        Map<String,Integer> map = new HashMap<>(); 
        int len = words[0].length();
        int l = words.length;
        
        for(String str : words){
            
            if(map.containsKey(str)){
                map.put(str,map.getOrDefault(str,0)+1);
            }
            else{
                map.put(str,1);
            }
        }
        
        // System.out.print("\n Map = "+map);
        
        List<Integer> ans = new ArrayList<>();
        
       for(int i=0;i<=s.length()-(len*l);i++){
           
           String sub = s.substring(i,i+(len*l));
           if(checkValid(map,sub,len)){
               ans.add(i);
           }
       }
        return ans;
    }
}
