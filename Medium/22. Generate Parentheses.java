class Solution {
    public void find(List<String> ans, int r, int l, String s){
        if(l==0 && r==0){
            ans.add(s);
            return;
        }

        if(l>0){
            find(ans, r+1, l-1, s+'(');
        }
        if(r>0){
            find(ans, r-1, l, s+')');
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        find(ans, 0, n, "");

        return ans;
    }
}
