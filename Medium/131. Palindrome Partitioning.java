//reference from Question 491. Non-decreasing Subsequences

class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> ans = new ArrayList<>();
        List<String> a = new ArrayList<>();
        find(0,s,a,ans);
        return ans;
    }
    public void find(int i, String s, List<String> str,List<List<String>> ans){
        if(i==s.length()){
            ans.add(new ArrayList(str));
            return ;
        }
        for(int k=i;k<s.length();k++){
            if(IsPalindrome(s,i,k)){
                str.add(s.substring(i,k+1));
                find(k+1,s,str,ans);
                str.remove(str.size()-1);
            }
        }
    }
    public boolean IsPalindrome(String s, int i,int j){

        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
