class Solution {
    public String convertToTitle(int cn) {
        StringBuffer ans = new StringBuffer();

        while(cn>0){
            cn--;
            ans.insert(0, (char)('A'+cn%26));
            cn/=26;
        }
        return ans.toString();
    }
}
