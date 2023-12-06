class Solution {
    public int totalMoney(int n) {
        int i=n/7;
        int ans=0;
        
        for(int j=1;j<=i;j++){
            ans+=7*(j+3);
        }
        
        System.out.println(ans);
        for(int j=7*i;j<n;j++){
            ans+=++i;
        }
        
        System.out.println(ans);
        return ans;
    }
}