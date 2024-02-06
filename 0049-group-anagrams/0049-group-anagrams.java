class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        Arrays.sort(strs);
        
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String ns = String.valueOf(c);
            
            if(!map.containsKey(ns)){
                List<String> l = new ArrayList<>();
                l.add(s);
                map.put(ns, l);
            }
            else{
                map.get(ns).add(s);
            }
        }
        
        // System.out.println(map);
        
        for(String s:map.keySet()){
            ans.add(map.get(s));
        }
        
        return ans;
    }
}