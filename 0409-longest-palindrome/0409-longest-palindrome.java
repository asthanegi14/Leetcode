class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int ans=0, odd=0;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }
        
        int size = set.size();
        
        if(size>0){
            ans = s.length()-size+1;
        }
        else{
            ans = s.length()-size;
        }
        
        return ans;
    }
}