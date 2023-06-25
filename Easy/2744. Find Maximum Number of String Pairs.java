class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        int count=0;
        for(String w: words){
            map.put(w, map.getOrDefault(w, 0)+1);
        }
        for(String w: words){
            String rev = "";
            rev+=w.charAt(1);
            rev+=w.charAt(0);
            
            if(rev.equals(w) && map.get(rev)==1){
                continue;
            }
            if(map.containsKey(rev) && map.get(rev)!=0){
                count++;
                map.put(rev, map.get(rev)-1);
                map.put(w, map.get(w)-1);
            }
        }
        return count;
    }
}
