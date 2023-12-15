class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for(List<String> s: paths){
            set.add(s.get(0));
        }
        
        for(List<String> s: paths){
            if(!set.contains(s.get(1))){
                return s.get(1);
            }
        }
        
        return "";
    }
}