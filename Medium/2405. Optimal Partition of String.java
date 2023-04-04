class Solution {
    public int partitionString(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int count=0;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(map.containsKey(c)){
                map.clear();
                count++;
            }
            map.put(c,1);
        }
        if(!map.isEmpty()){
            count++;
        }
        return count;
    }
}
