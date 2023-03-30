class Solution {
    HashMap<String,Boolean> map = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }

        if(s1.equals(s2)){
            return true;
        }
        String s = s1+s2;
        if(map.containsKey(s)){
            return map.get(s);
        }
        int n=s1.length();
        boolean b = false;

        for(int i=1;i<n;i++){
            if((isScramble(s1.substring(0,i), s2.substring(0,i)) && isScramble(s1.substring(i), s2.substring(i))) || (isScramble(s1.substring(0,i), s2.substring(n-i)) && isScramble(s1.substring(i), s2.substring(0,n-i)))){
                b=true;
                break;
            }
        }
        map.put(s, b);
        return b;
    }
}
