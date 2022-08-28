class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character,Integer> r = new HashMap<>();
        Map<Character,Integer> m = new HashMap<>();
        
        for(int i=0;i<ransomNote.length();i++){
            r.put(ransomNote.charAt(i),r.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        // System.out.println("r = "+r);
        
        for(int i=0;i<magazine.length();i++){
            m.put(magazine.charAt(i),m.getOrDefault(magazine.charAt(i),0)+1);
        }
        // System.out.println("m = "+m);
        int a=0,b=0;
        for(int i=0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            // System.out.println("c = "+c);
            if(!m.containsKey(c)){return false;}
            a = r.get(c);
            b = m.get(c);
            // System.out.println("a = "+a);
            // System.out.println("b = "+b);
            if(b<a){return false;}
        }
        
//         int end=ransomNote.length();
//         for(int i=0;i<magazine.length();i++){
//             if(end<=magazine.length()){
//                 String s = magazine.substring(i,end);
//                 for(int j=0;j<s.length();j++){
//                     m.put(s.charAt(j),m.getOrDefault(s.charAt(j),0)+1);
//                 }
//              // System.out.println("m = "+m);
            
//             if(r.equals(m)){
//                 return true;
//             }
//                 m.clear();
//            end++;
//             }
            
//         }
        
        return true;
    }
}
