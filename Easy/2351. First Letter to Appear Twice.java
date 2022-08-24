class Solution {
    public char repeatedCharacter(String s) {
        Map<Character, Integer> res = new HashMap<>();
        char ans = ' ';
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(res.containsKey(c)){
                ans = c;
                break;
            }
            else{
                res.put(c,res.getOrDefault(c,0)+1);
            }
        }
        
        return ans;
    }
}
