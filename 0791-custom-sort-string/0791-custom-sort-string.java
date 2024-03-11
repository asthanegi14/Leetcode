class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        // System.out.println(map);
        String ans = ""; 
        
        for(int i=0;i<order.length();i++){
            char c = order.charAt(i);
            
            if(map.containsKey(c)){
                int count = map.get(c);
                while(count-->0){
                    ans+=c;
                }
                map.remove(c);
            }
        }
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int count = map.get(c);
                while(count-->0){
                    ans+=c;
                }
                map.remove(c);
            }
        }
        
        return ans;
    }
}