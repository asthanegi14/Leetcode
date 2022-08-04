class Solution {
    public int longestPalindrome(String s) {
        Set<Character> h = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(h.contains(s.charAt(i))){
                h.remove(s.charAt(i));
            }
            else{
                h.add(s.charAt(i));
            }
        }
        int n = h.size();
        int ans=0;
        if(n>0){
            ans = s.length() - n + 1;
        }
        else{
            ans = s.length() - n;
        }
        return ans;
    }
}
