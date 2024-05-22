class Solution {
    public boolean isPalindrome(String s){
        int i=0, n=s.length()-1;
        
        while(i<n){
            if(s.charAt(i++)!=s.charAt(n--)){
                return false;
            }
        }
        
        return true;
    }
    public void find(String s, List<List<String>> ans, List<String> a, int i){
        if(i==s.length()){
            ans.add(new ArrayList<>(a));
            return;
        }
        
        for(int j=i;j<s.length();j++){
            if(isPalindrome(s.substring(i, j+1))){
                a.add(s.substring(i, j+1));
                find(s, ans, a, j+1);
                a.remove(a.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        
        find(s, ans, new ArrayList<>(), 0);
        return ans;
    }
}