class Solution {
    public void find(List<String> ans, int i, int j, String s){
        if(i==0 && j==0){
            ans.add(s);
            return;
        }
        
        if(i>0){
            find(ans, i-1, j+1, (s+"("));
        }
        if(j>0){
            find(ans, i, j-1, (s+")"));
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        find(ans, n, 0, "");
        return ans;
    }
}