class Solution {
    public List<String> find(String s, int i, Set<String> set){
        List<String> a = new ArrayList<>();
        
        if(i==s.length()){
            a.add("");
        }
        
        for(int j=i+1;j<=s.length();j++){
            String sub = s.substring(i, j);
            if(set.contains(sub)){
                List<String> l = find(s, j, set);
                
                for(String k:l){
                    a.add(sub+(k.equals("") ? "":" ")+k);
                }
            }
        }
        
        return a;
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
            
        return find(s, 0, set);
    }
}