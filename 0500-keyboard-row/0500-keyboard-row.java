class Solution {
    public String[] findWords(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        String[] s = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        List<String> ans = new ArrayList<>();
        
        for(int i=0;i<s.length;i++){
            for(char j:s[i].toCharArray()){
                map.put(j, i);
            }
        }

        for(String i:words){
            if(i.equals("")){
                continue;
            }
            int idx = map.get(i.toUpperCase().charAt(0));
            for(char j:i.toUpperCase().toCharArray()){
                if(map.get(j)!=idx){
                    idx = -1;
                    break;
                }
            }
            
            if(idx!=-1){
                ans.add(i);
            }
        }
        return ans.toArray(new String[0]);
    }
}