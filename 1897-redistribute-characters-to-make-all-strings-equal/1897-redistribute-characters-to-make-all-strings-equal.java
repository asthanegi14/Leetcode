class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length==1){
            return true;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(String i: words){
            for(int j=0;j<i.length();j++){
                char c = i.charAt(j);
                map.put(c, map.getOrDefault(c, 0)+1);
            }
        }
        
        System.out.println(map);
        for(Map.Entry<Character, Integer> e: map.entrySet()){
            int val = e.getValue();
            if(val%words.length!=0 || val<words.length){
                return false;
            }
        }
        
        return true;
    }
}