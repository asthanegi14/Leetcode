class Solution {
    public boolean isAnagram(String a, String b){
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        for(char c : a.toCharArray()){
            c1[c-'a']++;
        }
        for(char c : b.toCharArray()){
            c2[c-'a']++;
        }
    
        return Arrays.equals(c1,c2);
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        
        int i=0,ns=s.length(),np = p.length();
        while(np<=ns){
            if(isAnagram(s.substring(i,np),p)){
                ans.add(i);
            }
            i++;
            np++;
        }
        return ans;
    }
}
