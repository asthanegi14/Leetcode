class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character,String> map = new HashMap<>();
        map.put('a',".-");
        map.put('b',"-...");
        map.put('c',"-.-.");
        map.put('d',"-..");
        map.put('e',".");
        map.put('f',"..-.");
        map.put('g',"--.");
        map.put('h',"....");
        map.put('i',"..");
        map.put('j',".---");
        map.put('k',"-.-");
        map.put('l',".-..");
        map.put('m',"--");
        map.put('n',"-.");
        map.put('o',"---");
        map.put('p',".--.");
        map.put('q',"--.-");
        map.put('r',".-.");
        map.put('s',"...");
        map.put('t',"-");
        map.put('u',"..-");
        map.put('v',"...-");
        map.put('w',".--");
        map.put('x',"-..-");
        map.put('y',"-.--");
        map.put('z',"--..");

        HashMap<String, Integer> ans = new HashMap<>();

        for(String s:words){
            char[] ch = s.toCharArray();
            String sto = "";
            for(int i=0;i<ch.length;i++){
                sto += map.get(ch[i]);
            }
            ans.put(sto, ans.getOrDefault(sto,0)+1);
        }
        // System.out.pritln();
        return ans.size();
    }
}
