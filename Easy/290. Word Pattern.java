class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Boolean> map2 = new HashMap<>();

        String[] st = s.split(" ");

        if(pattern.length()!= st.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            Character c = pattern.charAt(i);
            if(!map1.containsKey(c)){
                if(map2.containsKey(st[i])==true){
                    return false;
                }
                else{
                    map1.put(c,st[i]);
                    map2.put(st[i],true);
                }
            }
            else{
                String mw = map1.get(c);
                if(!mw.equals(st[i])){
                    return false;
                }
            }
        }
        
        return true;
    }
}
