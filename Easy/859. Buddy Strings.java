class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.equals(goal)){
            Set<Character> set = new HashSet<>();
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                set.add(c);
            }
            return set.size()<goal.length();
        }

        int i=0, j=s.length()-1;

        while(i<j && s.charAt(i) == goal.charAt(i)){
            i++;
        }
        while(j>=0 && s.charAt(j) == goal.charAt(j)){
            j--;
        }

        if(i<j){
            char[] c = s.toCharArray();
            char t = c[i];
            c[i] = c[j];
            c[j] = t;
            s = new String(c);
        }
        return s.equals(goal);
    }
}
