class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        Set<Character> s1 = new HashSet<>();        
        Set<Character> s2 = new HashSet<>();
        
        for(int i=0;i<word1.length();i++){
            char c = word1.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
            s1.add(c);
        }
        
        for(int i=0;i<word2.length();i++){
            char c = word2.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0)+1);
            s2.add(c);
        }
        
        List<Integer> a = new ArrayList<>();        
        List<Integer> b = new ArrayList<>();
        
        for(char i: map.keySet()){
            // System.out.println(i+" "+map.get(i));
            a.add(map.get(i));
        }
        for(char i: map2.keySet()){
            // System.out.println(i+" "+map2.get(i));
            b.add(map2.get(i));
        }
        // System.out.println(map);
        // System.out.println(map2);
        Collections.sort(a);        
        Collections.sort(b);
        
        return a.equals(b) && s1.equals(s2);
    }
}