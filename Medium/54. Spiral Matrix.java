class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer> ans = new ArrayList<>();
        int l=0,top=0,r=a[0].length-1,bot=a.length-1;
        
        while(top<=bot && l<=r){
            for(int i=l;i<=r;i++){
                ans.add(a[top][i]);
            }
                top++;
            for(int i=top;i<=bot;i++){
                ans.add(a[i][r]);
            }
                r--;
            if(top<=bot){
                for(int i=r;i>=l;i--){
                    ans.add(a[bot][i]);
                }
                    bot--;
            }
            if(l<=r){
                for(int i=bot;i>=top;i--){
                    ans.add(a[i][l]);
                }
                l++;
            }
        }
        return ans;
    }
}
