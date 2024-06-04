class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int i=0, j=s.length(), ans=0;
        
        while(i<j){
            char c = s.charAt(i);
            if(set.contains(c)){
                set.remove(c);
            }
            else{
                set.add(c);
            }
            i++;
        }
        
        if(set.size()>0){
            ans = s.length()-set.size()+1;
        }
        else{
            ans = s.length()-set.size();
        }
        
        return ans;
    }
}