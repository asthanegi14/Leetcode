class Solution {
    public int minSteps(String s, String t) {
        int[] c = new int[26];
        int count=0;
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            c[ch-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(c[ch-'a']<=0){
                count++;
                // System.out.println("i = "+i+" ch = "+ch);
                // c[ch-'a']=Integer.MIN_VALUE;
            }
            c[ch-'a']--;
        }
        
        return count;
    }
}