class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> m = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(m.containsKey(c)){
                m.put(c,m.getOrDefault(c,0)+1);
            }
            else{
                m.put(c,1);
            }
        }
        for(int i=0;i<t.length();i++)
        {
            char c = t.charAt(i);
            if(!m.containsKey(c))
            {
                return false;
            }
            if(m.get(c)==1){
                m.remove(c);
            }
            else{
                m.put(c,m.getOrDefault(c,0)-1);
            }
        }
        return m.size()==0;
    }
}
