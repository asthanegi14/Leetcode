class Solution {
    public int[] diStringMatch(String s) {
        int[] ans = new int[s.length()+1];
        int a=0, b=s.length();
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            if(c1=='I'){
                ans[i] = a;
                a++;
            }
            if(c1=='D'){
                ans[i] = b;
                b--;
            }
        }
        ans[s.length()] = b;
        return ans;
    }
}
