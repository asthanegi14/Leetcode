class Solution {
    public String getHint(String secret, String guess) {
        int c=0,b=0;
        Map<Character, Integer> scrt = new HashMap<>();
        Map<Character, Integer> gss = new HashMap<>();
        
        for(int i=0;i<secret.length();i++){
            char a1 = secret.charAt(i);
            char a2 = guess.charAt(i);
            
            if(a1==a2){
                b++;
                continue;
            }
            
            else{
                scrt.put(a1,scrt.getOrDefault(a1,0)+1);
                gss.put(a2,gss.getOrDefault(a2,0)+1);
            }
        }
        
        for(Character q : gss.keySet()){
            if(!scrt.containsKey(q)){continue;}
            c+=Math.min(scrt.get(q), gss.get(q));
        }
        return b+"A"+c+"B";
    }
}
