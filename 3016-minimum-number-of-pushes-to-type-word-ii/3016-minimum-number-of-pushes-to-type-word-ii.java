class Solution {
    public int minimumPushes(String word) {
        char[] c = word.toCharArray();
        
        Map<Character, Integer> map = new TreeMap<>();
        int ans=0, pos=1;
        
        for(char ch:c){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        List<Map.Entry<Character, Integer>> a = new ArrayList<>(map.entrySet());
        a.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        int i=0;
        
        for(Map.Entry<Character, Integer> chr: a){
            ans += chr.getValue()*pos;
            
            if(i!=0 && (i+1)%8==0){
                pos++;
            }
            i++;
        }
        
        return ans;
    }
}